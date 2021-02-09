package com.arolla.diamond;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by aminebechraoui, on 08/02/2021, in com.arolla.diamond
 */
public class Diamond {
    private char diamondBaseChar;

    public Diamond(char inputChar) {
        diamondBaseChar = inputChar;
    }

    public Line buildLine(int lineNumber) {
        return new Line(lineNumber, diamondBaseChar);
    }

    public void printLines() {
        Stream<Line> diamondList = getDiamondListOfLine();

        diamondList.forEach(line -> {
            System.out.print(line.getStringValue());
        });
    }

    private Stream<Line> getDiamondListOfLine() {
        List<Line> upToBaseLineLines = buildLinesUpToBaseLine().collect(Collectors.toList());

        return Stream.concat(upToBaseLineLines.stream(),  getFromBaseLineLines(upToBaseLineLines).stream());
    }

    private List<Line> getFromBaseLineLines(List<Line> upToBaseLineLines) {
        List<Line> fromBaseLineLines = new ArrayList<Line>(upToBaseLineLines.subList(0, upToBaseLineLines.size() - 1));
        Collections.reverse(fromBaseLineLines);
        return fromBaseLineLines;
    }

    public Stream<Line> buildLinesUpToBaseLine() {
        return getIntStreamUpToBaseLine().mapToObj(this::buildLine);
    }

    private IntStream getIntStreamUpToBaseLine() {
        return IntStream.rangeClosed(1, getDiamondBaseCharAlphabeticOrder());
    }

    private int getDiamondBaseCharAlphabeticOrder() {
        int diamondBaseCharCodePoint =         String.valueOf(diamondBaseChar).codePointAt(0);
        return diamondBaseCharCodePoint > Line.LOWER_CASE ? diamondBaseCharCodePoint - Line.LOWER_CASE : diamondBaseCharCodePoint - Line.UPPER_CASE;
    }
}
