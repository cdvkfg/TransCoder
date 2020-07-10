// Copyright (c) 2019-present, Facebook, Inc.
// All rights reserved.
//
// This source code is licensed under the license found in the
// LICENSE file in the root directory of this source tree.
//

import java.util. *;
import java.util.stream.*;
import java.lang.*;
import javafx.util.Pair;
public class COUNT_SORTED_ROWS_MATRIX{
static int f_gold ( int mat [ ] [ ] , int r , int c ) {
  int result = 0 ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    int j ;
    for ( j = 0 ;
    j < c - 1 ;
    j ++ ) if ( mat [ i ] [ j + 1 ] <= mat [ i ] [ j ] ) break ;
    if ( j == c - 1 ) result ++ ;
  }
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    int j ;
    for ( j = c - 1 ;
    j > 0 ;
    j -- ) if ( mat [ i ] [ j - 1 ] <= mat [ i ] [ j ] ) break ;
    if ( c > 1 && j == 0 ) result ++ ;
  }
  return result ;
}


//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ] [ ]> param0 = new ArrayList<>();
    param0.add(new int[][]{new int[]{4,12,13,24,25,26,27,35,41,60,69,71,73,78,85,86,95,99},new int[]{1,13,18,25,41,42,44,45,49,49,51,52,59,63,64,67,78,97},new int[]{1,2,11,18,23,26,30,31,41,42,45,71,75,90,91,92,95,97},new int[]{26,30,44,46,46,54,56,60,67,68,75,77,77,83,87,87,94,98},new int[]{19,20,27,31,33,34,37,41,42,49,60,60,64,67,71,73,77,92},new int[]{2,6,9,11,20,29,37,41,42,44,49,58,62,76,87,89,94,97},new int[]{7,8,9,14,20,45,49,54,63,63,64,71,72,73,73,89,94,95},new int[]{2,3,7,16,17,23,23,25,44,50,58,58,59,78,83,87,90,99},new int[]{4,16,18,22,23,33,34,43,43,46,51,56,62,75,79,85,97,97},new int[]{16,18,29,32,39,53,54,55,67,70,72,72,76,76,86,87,96,96},new int[]{6,30,34,37,38,42,52,54,59,67,71,71,72,81,85,87,91,93},new int[]{2,6,6,16,18,20,21,31,40,42,50,56,62,80,80,83,91,96},new int[]{2,5,6,14,16,21,23,37,52,59,72,86,86,87,87,89,90,91},new int[]{1,10,17,20,22,25,27,32,37,37,44,49,65,78,80,81,85,95},new int[]{1,13,14,21,43,50,52,58,62,64,65,66,66,66,67,70,81,82},new int[]{1,2,9,16,17,23,25,29,30,31,42,65,73,74,82,87,92,92},new int[]{1,5,9,13,21,28,32,33,34,38,46,60,80,86,93,94,96,98},new int[]{11,18,23,24,25,26,28,48,59,59,67,72,82,83,86,89,92,96}});
    param0.add(new int[][]{new int[]{82,82,2,8,-32,90,-76,-64,-66,-46,-72,-58,-28,-86,-8,-96,-62,-32,54,-16,96,28,76,90,-40,98,88,-90,4,-50,70,32,-74,-72,-72,10,36,50,-16,-36},new int[]{-52,-6,12,-6,-64,6,38,-14,-86,74,-74,82,54,2,46,-94,88,86,-32,-72,72,88,90,-8,-58,32,-90,-68,-70,72,34,74,-30,92,90,-88,82,-54,42,94},new int[]{-4,-32,-12,-96,16,-32,32,52,2,-6,2,-10,40,-64,4,-56,-50,46,54,-6,-14,-40,-98,-4,-20,98,94,60,-70,-94,52,-4,32,20,-30,-94,-50,50,-86,-66},new int[]{10,84,2,-44,-54,-82,-64,70,-20,-40,-50,10,26,-14,-88,10,-80,-48,10,16,-14,-52,74,-60,48,-60,-62,38,56,-34,86,20,74,-20,28,-46,-44,96,-58,-8},new int[]{-48,-36,-18,-66,-20,60,-36,34,-94,44,-14,-34,-84,-26,38,48,14,12,72,-76,26,50,-58,40,90,14,-40,22,-26,-24,66,-62,-34,16,-34,-30,54,-76,-26,4},new int[]{-26,56,74,-82,58,-42,-98,96,-24,-36,-86,-80,42,78,-2,-90,-8,-52,46,-20,-16,64,-36,-8,-16,-60,96,40,66,98,14,-36,-78,-40,52,60,-20,38,26,-98},new int[]{-12,60,-56,-66,68,-20,-74,30,14,-36,-22,-54,50,62,-44,14,90,66,80,76,-86,92,-80,-6,48,44,24,40,94,-42,68,28,-20,98,40,50,-18,90,6,2},new int[]{-98,4,-32,-34,-64,58,16,48,82,10,36,32,-60,-40,2,-14,-58,28,-44,60,-28,-6,-68,46,-50,62,10,44,-4,76,60,-26,52,40,-88,-56,-36,-70,-66,-22},new int[]{18,-66,-82,52,34,-86,-50,-64,18,10,-14,8,80,-76,20,76,96,-12,-36,86,-10,16,-14,66,-4,14,-82,0,2,90,78,-48,42,-60,90,-16,80,16,-64,-58},new int[]{12,8,-74,78,46,-84,20,14,-2,-42,-80,-66,-64,34,58,0,28,-8,34,92,-14,-54,82,68,64,6,30,78,-50,-28,-74,-12,-18,82,-50,-86,-2,-78,94,-66},new int[]{10,-76,58,32,-44,60,-14,24,-92,24,16,80,90,-60,-6,8,-50,90,60,82,6,84,74,-48,-98,-2,-38,74,64,52,8,-32,-58,-58,70,-14,68,46,32,74},new int[]{84,98,78,34,-94,84,10,84,10,-58,-70,-30,98,-28,-80,56,-36,96,82,38,2,-38,28,18,82,60,-16,-64,90,34,-10,98,36,40,-6,-32,-32,-24,92,12},new int[]{54,92,-30,-12,40,48,8,34,-20,-58,8,-14,0,-34,98,-32,-98,40,-44,34,94,-56,-90,64,4,-76,-34,-68,48,28,84,-4,-46,-54,72,-82,0,-82,38,-6},new int[]{44,-66,-86,54,-4,36,62,88,-16,-88,-26,-50,-84,-90,38,14,62,14,-92,64,-50,-2,-96,-4,94,-84,26,-86,-68,6,-18,-66,-56,-88,-92,-86,64,-6,-92,-12},new int[]{-36,80,-28,-42,58,-12,-66,-38,-76,34,-52,-32,-80,66,54,-2,-40,78,14,-54,6,-92,68,-40,72,-80,52,-60,98,-60,-92,26,-24,26,46,34,80,-92,16,16},new int[]{-4,60,-72,-6,46,76,-8,82,42,-68,-86,10,20,80,-22,64,-40,22,-6,-58,-74,-86,-16,-14,-76,-54,-98,-50,-74,80,-44,18,-70,-80,58,-48,-70,44,46,88},new int[]{-80,-76,-46,-92,-78,-72,-56,72,-52,-86,-48,6,84,38,-14,66,48,86,36,-80,-54,-44,-88,-18,-50,-56,-20,-14,-52,-98,-44,-76,-42,-66,-20,62,0,-54,-82,-70},new int[]{44,98,78,56,-14,-70,-24,62,88,70,-42,72,80,42,22,-90,-50,-22,14,40,42,34,66,-58,70,22,-86,58,-82,54,-20,72,20,32,8,30,52,-6,-12,-62},new int[]{-4,70,-76,22,22,44,-84,-74,34,-36,64,-78,50,72,-40,-78,-26,-66,-84,-28,-40,-96,66,36,-28,-18,4,0,20,18,78,-74,-58,-64,-68,68,-84,20,-56,-16},new int[]{0,24,64,-50,-36,70,-88,-34,70,68,-68,80,88,12,-50,74,32,18,-14,74,58,68,-62,-30,20,94,-68,96,-32,-94,-70,-44,-76,-94,34,54,-74,62,-80,-10},new int[]{-64,-26,-26,44,14,-72,-74,36,-8,-64,-34,6,18,14,74,-90,66,-12,-6,-6,-12,-58,72,18,62,-44,12,-56,66,34,44,0,-98,96,-94,-60,76,52,48,-6},new int[]{6,-58,14,82,-72,0,92,8,-6,-18,74,-66,68,-24,-20,90,-48,54,18,-24,-8,-48,72,-78,-54,84,18,-52,-36,-30,-82,-34,8,-94,-34,-78,-28,44,92,-78},new int[]{-50,-84,-82,-12,62,-72,-36,84,-36,-82,12,-52,12,-34,36,8,-24,58,6,-34,0,-22,46,98,62,80,-88,-24,98,30,22,94,-38,-24,78,62,0,-10,2,52},new int[]{94,-10,-88,-12,-10,56,-86,18,54,-20,22,-18,76,-88,-38,38,-88,-20,82,88,-80,-34,14,54,28,-46,-88,-84,-86,38,86,26,98,-28,14,-24,-22,-80,-98,58},new int[]{60,52,12,-86,-54,-30,10,-2,-54,-74,56,74,-74,92,86,-92,-28,-54,30,-56,40,96,92,16,82,-70,-80,92,-80,14,56,-6,8,-92,20,10,-50,-64,-34,50},new int[]{64,70,-74,-72,78,46,42,44,-96,-18,-62,56,-90,-14,38,82,8,-58,52,92,-90,22,-60,62,60,-64,-56,-74,92,-2,-90,-14,-56,-64,38,18,-52,-92,30,-36},new int[]{50,84,82,36,60,34,-50,-64,-72,30,8,84,48,-24,78,80,-10,-90,82,-80,-4,-94,24,92,92,-16,-80,68,60,98,-92,52,60,8,-72,12,-60,-84,-44,-34},new int[]{-98,-30,30,36,96,74,-82,-2,-72,-38,-40,10,92,30,98,-28,56,70,-84,66,40,92,42,-86,-58,-90,-10,98,-12,-80,94,4,-84,60,94,-90,74,-68,64,-76},new int[]{2,94,38,-6,64,4,-42,92,-12,54,82,90,-64,32,0,-24,-16,-68,78,54,28,-86,-56,4,16,98,32,-18,-76,90,-6,72,40,20,6,-90,52,-62,4,30},new int[]{22,90,54,-34,-30,0,-72,-6,36,28,-96,86,-2,-48,-30,8,-60,-32,24,-50,-76,-86,32,28,-66,-88,24,86,72,96,22,-32,-92,-26,48,-52,-12,4,-94,2},new int[]{-44,70,38,36,-36,46,-68,-44,-36,34,-32,-44,-22,-80,-64,28,60,92,-52,14,42,-80,-70,50,24,-34,16,64,62,-94,18,-48,-68,16,76,-42,30,-88,46,-12},new int[]{46,46,44,16,-70,-6,-78,-46,70,30,70,88,66,56,-12,4,76,-50,-28,-98,-16,-86,-68,36,28,-92,-46,-86,-2,90,6,36,-62,-30,-26,-38,22,-60,-20,-70},new int[]{80,38,-94,-42,70,-20,42,-62,-30,54,82,-94,-78,74,60,54,-52,-56,66,86,-30,-14,0,-6,-22,56,70,-86,50,82,72,-10,54,24,-46,-26,-20,-54,-96,30},new int[]{-48,94,54,-16,70,20,-20,-2,-8,84,-60,30,-18,-14,32,42,24,26,-12,-62,2,-94,26,36,-88,-22,-64,46,36,74,-44,-56,-36,-98,70,72,-68,68,76,-32},new int[]{-4,36,0,14,-42,-38,-98,-2,-44,-90,82,80,-66,38,62,34,52,44,-22,80,-74,-88,-74,24,98,8,18,-26,-4,-82,-60,44,-2,30,20,52,26,-22,-54,96},new int[]{98,-54,-12,-12,-74,34,-6,-36,-94,40,96,42,-32,-46,-46,88,-90,26,-98,30,92,-34,74,-94,36,-68,-66,74,-2,6,94,-12,82,90,-2,78,-80,-84,18,74},new int[]{-42,30,56,-74,-16,-44,4,-62,-12,-62,-22,64,56,96,-16,40,10,88,-66,54,56,96,74,-6,-36,-70,-82,74,-14,-18,-32,-70,60,26,-88,-78,-8,32,-84,90},new int[]{-44,-14,-44,96,0,54,2,74,36,-56,-98,-16,-70,68,-88,26,-18,30,62,-88,-28,-58,62,-38,-62,28,-80,-6,88,-16,64,-58,14,94,-40,2,-12,-16,-24,-64},new int[]{20,18,-94,94,-2,-74,-56,-46,62,-88,-16,-30,-10,-54,38,22,-42,32,28,-42,44,64,46,66,-96,70,-32,10,-14,72,-42,98,-54,36,76,24,-96,86,54,-88},new int[]{74,-48,90,78,-44,0,76,-16,-28,-92,10,-32,-30,-78,-8,40,-90,74,-40,16,-78,22,-42,36,68,44,42,6,-60,36,-74,-92,92,-44,40,-92,-46,56,-36,-94}});
    param0.add(new int[][]{new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}});
    param0.add(new int[][]{new int[]{91,8,34,7,66,59,90,78,54,77,55,29,90,69,85,42,39,49,83,59,3,41,65,60,4,45,65,29,47,40,96,11,21,74,34,83,12,3,6,67,30,29,40,87,35,73,17,13,20},new int[]{38,36,55,16,85,38,67,15,37,25,81,61,31,68,31,11,23,39,35,21,66,66,52,49,55,35,40,47,99,25,91,6,50,3,62,11,46,88,95,17,40,70,35,76,59,84,4,99,84},new int[]{61,2,63,5,81,77,7,32,74,17,53,17,86,5,86,15,80,84,94,64,86,94,64,7,90,64,15,94,56,51,64,84,77,70,49,2,46,96,64,25,18,54,39,73,77,23,46,14,23},new int[]{48,22,2,60,46,8,3,70,58,6,27,23,71,92,10,45,48,85,81,86,61,27,85,75,1,49,47,82,8,74,92,40,61,27,12,30,37,66,84,36,86,40,36,96,60,96,70,27,41},new int[]{13,6,54,10,54,19,24,61,87,77,14,45,37,15,74,4,47,61,78,91,68,99,67,70,70,26,72,19,75,93,56,66,76,80,49,45,62,85,50,51,48,40,48,13,69,62,82,13,13},new int[]{25,75,45,24,38,4,19,83,38,61,21,59,71,72,76,59,36,31,72,23,16,22,68,40,28,60,89,87,87,89,16,11,45,89,75,25,43,67,69,41,66,91,38,62,73,29,13,45,68},new int[]{30,1,39,11,69,4,8,3,52,59,24,47,88,62,30,96,38,80,62,86,81,12,72,65,10,64,95,58,60,95,51,60,89,35,54,85,67,38,58,85,12,40,5,47,35,95,26,60,33},new int[]{47,58,24,5,76,9,56,45,32,69,14,63,7,2,55,36,29,59,15,64,65,80,99,2,99,23,18,98,26,38,58,52,92,53,18,40,86,93,18,26,71,65,29,91,80,91,29,44,31},new int[]{63,5,55,56,10,58,53,43,89,30,98,71,20,94,28,27,65,65,54,66,69,28,82,30,2,13,71,16,31,55,65,62,76,66,36,70,42,66,82,73,63,21,27,89,44,99,70,75,96},new int[]{6,19,62,34,59,79,75,95,84,64,95,81,81,77,83,62,24,4,18,97,33,43,57,40,90,65,10,88,84,54,68,58,40,46,88,32,1,97,4,36,41,57,30,13,43,77,88,99,29},new int[]{23,37,24,76,53,11,28,95,2,89,27,47,2,3,12,67,25,66,7,38,45,63,15,93,2,12,44,28,68,27,52,23,85,4,59,92,35,17,27,7,91,20,84,22,26,34,63,87,54},new int[]{97,74,14,36,43,72,69,25,78,13,46,10,88,50,49,98,55,43,22,78,13,78,46,9,24,32,61,91,51,53,58,95,54,47,11,21,18,60,10,27,82,66,90,40,45,52,98,85,16},new int[]{34,59,78,37,11,87,79,40,58,33,82,33,96,86,94,40,71,85,59,22,65,73,20,63,76,91,24,29,68,27,45,97,69,33,43,86,92,31,19,32,15,39,37,19,14,38,5,53,20},new int[]{44,25,58,89,40,99,34,90,26,87,63,16,43,84,77,25,48,55,7,47,43,84,3,41,28,65,34,9,43,39,76,8,52,12,75,43,16,94,18,93,12,83,54,15,27,81,46,89,24},new int[]{67,92,60,34,46,5,80,64,53,65,94,65,36,66,56,52,82,54,32,55,69,88,43,41,11,8,33,95,32,48,71,9,89,7,2,33,29,76,33,38,99,48,99,92,68,22,70,19,14},new int[]{90,32,71,27,57,73,87,90,40,24,15,27,70,87,74,29,8,30,17,87,13,93,46,87,12,30,43,80,14,3,23,75,67,51,23,49,69,69,69,54,57,46,60,43,47,70,14,30,95},new int[]{69,58,48,20,45,70,13,66,65,42,62,76,9,8,17,28,22,2,60,6,73,54,24,32,15,11,75,62,8,99,51,36,83,15,55,18,17,78,80,82,97,70,60,46,78,16,1,26,43},new int[]{34,59,69,68,91,5,24,72,81,23,64,19,72,6,66,72,91,96,65,11,28,27,27,87,87,61,29,52,86,14,41,86,59,5,42,91,22,50,9,6,99,37,24,4,8,67,62,38,99},new int[]{62,48,96,3,14,75,47,80,50,61,51,77,82,37,31,49,87,48,94,4,92,94,99,26,65,29,18,4,9,14,35,60,54,33,52,49,44,31,53,95,28,3,14,97,53,19,80,73,5},new int[]{18,14,24,76,93,33,55,40,65,59,45,3,29,17,12,4,60,72,23,82,14,94,65,19,24,50,91,80,96,78,41,37,75,77,4,94,69,80,48,5,55,85,43,58,36,3,8,40,87},new int[]{92,18,42,47,28,4,55,10,46,52,75,20,48,62,7,14,78,95,49,58,14,2,43,29,57,98,83,90,56,62,92,91,2,69,79,44,1,5,43,54,34,88,67,60,42,37,56,51,3},new int[]{28,31,22,14,75,56,68,57,39,10,73,69,72,27,79,2,99,99,10,24,48,56,19,9,21,80,36,43,11,49,85,49,84,84,28,48,13,80,39,94,8,19,97,73,3,12,29,34,34},new int[]{99,50,58,74,49,22,2,84,94,89,94,38,68,86,42,41,43,69,49,17,17,96,78,18,93,48,18,32,87,16,6,70,97,72,55,20,40,56,51,54,3,57,69,71,74,18,64,31,39},new int[]{23,18,26,32,12,65,32,90,98,14,8,79,44,56,52,33,34,31,92,95,99,11,90,65,59,95,49,27,77,64,21,33,2,69,11,67,65,89,40,12,66,60,65,10,62,48,32,84,43},new int[]{87,26,33,4,89,44,32,68,19,61,35,74,56,55,82,66,79,76,10,64,95,33,87,89,88,67,11,14,85,99,56,78,72,51,43,44,76,11,77,14,83,70,44,58,2,46,75,61,31},new int[]{93,73,8,30,6,84,16,28,43,47,80,29,89,86,91,83,98,42,91,65,20,77,34,1,24,57,77,96,66,61,55,63,7,1,52,67,85,47,32,74,88,34,94,73,7,59,78,47,42},new int[]{90,35,30,1,10,96,62,91,53,13,6,33,44,6,62,49,40,35,55,30,96,98,51,57,83,45,52,51,64,70,92,99,91,2,7,95,50,77,82,23,2,56,39,97,86,55,72,69,92},new int[]{45,12,56,49,85,32,64,91,3,47,10,82,50,33,71,53,94,32,57,63,59,65,83,85,73,94,28,95,76,11,51,17,87,12,69,65,58,31,76,94,13,42,15,43,34,14,60,88,24},new int[]{75,34,12,19,35,60,73,5,33,74,27,12,68,58,69,94,31,99,86,32,35,78,56,6,43,71,30,56,88,14,46,41,12,6,52,15,84,52,6,13,60,49,61,45,42,72,51,82,99},new int[]{95,81,81,39,93,29,96,7,99,11,94,42,1,16,99,74,68,49,15,6,15,80,68,25,86,69,76,6,64,96,87,57,94,99,39,71,3,92,68,30,5,91,49,40,5,26,58,82,90},new int[]{4,57,97,16,67,90,23,89,24,84,90,66,76,51,21,44,41,52,54,71,14,64,80,49,88,2,94,76,10,71,78,1,59,39,18,56,45,43,95,13,30,93,86,78,21,14,31,98,76},new int[]{40,86,5,71,50,83,56,89,56,6,75,48,16,31,65,10,90,63,84,63,1,81,6,21,89,58,70,18,72,49,10,68,2,99,10,51,86,63,55,77,90,32,53,48,99,76,45,31,52},new int[]{99,19,61,12,65,15,53,96,50,46,9,32,91,55,84,30,59,58,92,99,37,68,94,78,59,47,51,4,89,10,84,84,43,83,95,2,54,81,22,60,11,30,98,59,57,37,88,43,9},new int[]{14,75,98,81,61,53,54,7,97,68,98,21,92,20,12,26,14,69,52,59,36,37,89,82,13,57,26,34,12,72,12,63,91,10,21,73,46,60,8,17,5,50,30,10,83,53,97,90,39},new int[]{64,61,79,7,82,31,35,88,41,39,61,54,15,67,50,86,79,58,54,9,51,83,47,8,43,6,53,61,51,45,90,42,38,35,70,7,1,18,26,87,51,76,34,82,76,66,10,66,7},new int[]{62,86,31,83,51,75,40,72,22,4,42,47,56,77,36,55,36,36,74,55,67,3,96,88,38,68,2,34,92,83,16,97,70,13,36,65,73,20,49,53,49,13,32,47,42,29,26,81,44},new int[]{44,18,97,11,67,31,23,89,39,31,82,62,55,55,15,83,66,6,13,58,88,97,62,21,37,75,27,18,78,11,52,47,33,9,87,49,38,67,12,14,3,5,60,63,13,22,2,31,45},new int[]{55,47,20,4,13,45,34,25,95,4,13,19,1,36,74,85,51,23,35,95,23,65,63,58,67,12,18,51,21,23,38,87,92,65,69,14,48,62,86,73,41,52,12,55,85,46,88,44,38},new int[]{83,29,86,98,92,66,4,69,74,50,78,75,3,44,78,34,12,54,17,90,23,97,21,96,6,3,73,5,58,93,45,64,2,97,33,93,14,62,68,19,53,66,78,5,52,94,84,60,54},new int[]{15,44,11,54,64,99,91,94,57,73,95,25,24,4,66,11,84,83,50,89,31,83,27,75,98,49,15,3,59,20,67,67,4,67,23,97,87,17,67,57,91,34,81,99,90,29,55,88,28},new int[]{18,89,80,81,71,51,19,14,63,18,10,40,7,64,41,55,51,75,30,89,7,18,18,89,46,98,25,1,71,6,43,89,88,30,90,30,37,57,99,3,37,91,45,69,46,32,19,51,83},new int[]{11,5,99,30,60,57,35,66,16,60,93,22,7,20,58,29,91,80,59,81,52,1,51,79,88,26,92,40,12,59,9,57,42,94,24,17,79,36,48,71,83,48,88,50,69,12,62,27,22},new int[]{50,91,58,61,4,65,8,12,10,67,97,24,59,37,57,29,58,43,66,25,7,97,93,73,98,24,86,31,8,30,64,93,66,4,91,78,70,67,33,5,63,41,16,39,7,42,21,22,75},new int[]{2,16,31,71,84,77,39,36,83,7,14,43,53,3,76,98,29,68,75,3,5,94,73,21,2,97,73,48,6,66,45,85,27,99,62,67,34,66,13,39,18,11,4,35,62,55,91,86,63},new int[]{1,57,15,25,30,61,83,28,24,17,60,56,58,7,68,10,76,6,35,18,28,55,82,52,19,18,63,40,49,95,82,76,78,85,61,79,31,48,49,40,60,67,65,86,71,44,45,58,33},new int[]{64,70,88,84,20,95,73,14,2,56,94,73,83,25,93,58,49,91,76,72,10,42,73,35,49,88,12,87,78,87,78,38,57,81,12,19,14,75,71,24,78,32,23,61,8,68,61,54,4},new int[]{22,20,70,20,61,33,74,38,14,2,88,96,31,86,10,34,61,59,92,47,92,70,52,1,39,47,62,17,92,95,7,5,56,73,86,36,25,73,10,90,38,25,42,88,3,75,44,71,61},new int[]{90,36,14,93,21,25,23,58,5,43,65,53,93,76,93,25,48,20,73,42,28,2,92,13,24,28,20,88,53,90,52,86,33,31,39,58,19,80,54,24,19,48,11,17,41,13,63,56,48},new int[]{87,89,92,89,55,51,31,4,3,3,8,39,23,32,25,74,83,66,79,54,45,97,33,22,89,1,7,91,97,2,55,18,32,69,12,71,94,85,56,47,16,27,99,80,32,15,50,79,25}});
    param0.add(new int[][]{new int[]{-94,-78,-30,-16,-14,22,44,44,54,60,68,72,92,94,98},new int[]{-92,-68,-52,-40,-30,-28,-20,-16,14,38,42,54,60,72,86},new int[]{-78,-68,-58,-36,-10,-10,42,48,52,52,58,68,72,78,96},new int[]{-94,-86,-84,-60,-40,0,0,22,48,56,70,72,80,90,96},new int[]{-98,-92,-80,-68,-58,38,50,52,58,60,62,62,72,86,90},new int[]{-94,-92,-70,-64,-46,-38,-32,-14,-10,-6,18,30,32,74,98},new int[]{-72,-60,-52,-50,-26,-24,-6,4,10,40,46,86,88,98,98},new int[]{-94,-72,-40,-36,-36,-28,0,18,34,36,38,44,50,54,98},new int[]{-72,-60,-40,-38,-36,-26,-18,-8,-2,2,30,34,50,76,80},new int[]{-96,-74,-46,-38,-26,-16,-10,2,2,20,28,48,48,60,90},new int[]{-86,-60,-58,-58,-46,-40,-4,2,16,18,26,62,64,78,98},new int[]{-98,-50,-12,-10,-2,12,20,40,60,66,76,78,84,90,92},new int[]{-72,-68,-68,-52,-8,-6,10,20,42,52,54,56,72,86,90},new int[]{-80,-74,-32,10,18,54,62,74,76,78,86,86,88,94,96},new int[]{-98,-78,-76,-72,-56,-30,-26,0,36,42,44,76,84,88,94}});
    param0.add(new int[][]{new int[]{0,0,0,1,0,1,1,1,1,1,0,0,1,0,1,0,0,1,1,1,1,0,0,0,1,1,0},new int[]{0,0,1,0,0,0,0,0,1,0,1,0,1,1,1,0,0,1,1,1,1,1,1,0,0,0,1},new int[]{1,0,0,1,1,0,0,1,0,1,0,0,1,1,1,1,0,1,0,1,1,1,0,0,0,1,0},new int[]{1,1,1,1,1,0,0,1,0,1,0,0,0,1,0,0,0,0,1,1,1,1,1,0,0,1,0},new int[]{1,1,1,1,0,0,0,1,1,1,1,0,1,0,0,0,0,1,1,0,1,1,0,0,0,0,0},new int[]{1,0,1,1,0,0,1,1,0,1,0,0,0,1,0,0,1,0,0,1,1,1,0,1,1,0,0},new int[]{1,0,1,1,0,0,0,1,1,0,0,0,1,0,1,1,0,0,1,0,1,0,0,0,1,1,1},new int[]{1,0,0,0,0,1,0,1,0,0,0,0,1,0,1,1,0,1,1,1,0,0,0,1,0,0,0},new int[]{0,1,1,0,1,1,0,0,1,0,1,0,1,1,1,1,1,0,1,1,1,1,1,0,0,1,1},new int[]{0,1,0,0,1,0,1,1,1,0,0,1,1,0,0,0,1,1,0,0,1,1,0,1,1,0,1},new int[]{1,1,1,0,1,0,1,1,1,1,0,0,0,0,1,0,1,0,0,0,1,0,0,1,0,1,1},new int[]{0,0,0,1,0,0,1,0,0,1,0,0,1,0,0,0,0,1,0,0,0,1,1,1,0,0,1},new int[]{1,1,0,1,1,1,0,1,1,1,1,1,1,0,1,1,1,1,0,0,0,1,0,1,1,0,0},new int[]{1,1,1,0,1,1,1,0,0,1,0,0,1,1,1,0,0,1,1,1,0,0,0,0,0,1,0},new int[]{1,1,1,0,1,1,1,0,0,0,1,0,1,1,0,1,1,0,0,1,0,1,0,0,0,1,1},new int[]{0,1,1,0,0,1,0,0,1,0,1,0,1,1,1,0,1,1,0,1,0,0,0,0,1,1,0},new int[]{1,1,1,0,1,0,0,1,0,1,0,0,1,0,0,1,0,0,0,0,0,1,1,1,0,1,0},new int[]{0,0,0,0,0,0,1,1,1,0,0,1,0,0,1,0,0,0,1,1,0,1,1,1,0,0,1},new int[]{1,0,0,0,0,1,0,0,1,0,1,0,0,1,0,1,0,0,0,0,1,1,0,0,0,0,1},new int[]{0,0,0,0,0,1,0,1,1,0,0,1,0,0,1,0,0,0,0,1,0,1,0,1,1,0,1},new int[]{1,0,1,0,0,1,0,0,0,1,1,1,0,0,1,1,1,0,1,1,0,1,0,0,0,0,0},new int[]{1,1,0,0,1,0,1,1,1,0,0,0,1,0,0,0,0,1,1,0,1,1,1,0,1,0,0},new int[]{1,1,0,0,0,1,1,0,1,0,0,0,1,1,0,1,1,0,1,1,0,0,1,0,1,0,0},new int[]{0,1,0,1,0,0,0,1,0,1,0,1,1,1,1,0,1,0,0,1,0,1,0,1,0,0,1},new int[]{1,1,1,1,1,0,1,1,0,1,0,1,1,1,1,1,0,0,1,1,0,1,0,0,1,1,1},new int[]{1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,1,0,1,1,0,1},new int[]{0,0,0,1,0,1,1,1,1,1,1,0,0,0,1,0,1,0,1,1,1,1,1,1,0,0,0}});
    param0.add(new int[][]{new int[]{2,21,39,67,70,73,83,86,87,93},new int[]{31,42,53,56,64,65,85,89,94,98},new int[]{3,15,17,50,52,67,73,82,91,94},new int[]{12,15,16,21,23,30,33,38,50,89},new int[]{5,7,25,28,38,43,43,58,64,86},new int[]{24,26,29,33,46,47,52,71,86,96},new int[]{7,10,23,24,36,39,47,61,77,89},new int[]{1,10,26,27,61,62,64,80,85,94},new int[]{3,8,16,32,37,48,54,58,77,82},new int[]{43,52,70,76,81,84,84,85,95,99}});
    param0.add(new int[][]{new int[]{62,-24,-62,-18,46,14,90,-42,-98,-52,36,96,26,-26,38,-88,88,-98,-86},new int[]{-24,58,-70,-56,68,-66,-24,30,-86,-74,98,-24,-48,-28,24,-64,22,46,40},new int[]{2,-30,-94,6,-24,-42,-70,-20,-80,14,74,72,-68,58,36,40,88,-80,54},new int[]{-24,-50,-96,-36,36,30,-58,64,98,-86,-74,-18,-64,74,-46,-24,68,34,24},new int[]{-34,96,14,-50,-68,-72,-38,-52,56,4,60,-90,-70,16,-4,0,-82,2,-16},new int[]{22,10,54,-86,14,12,64,-54,92,2,88,50,-24,-86,-32,46,-66,-26,-90},new int[]{-22,26,44,2,70,-94,-78,32,-30,-64,90,-16,68,-60,-10,-18,-64,20,-18},new int[]{72,-14,-98,-54,72,18,24,4,-16,-26,78,-80,26,-10,18,20,22,68,20},new int[]{-32,74,14,-18,88,42,6,-6,-16,-30,80,-16,24,-96,-96,-52,-38,-34,-46},new int[]{-12,-72,-48,52,-64,-30,26,64,0,34,52,-66,98,-96,-52,-96,38,-56,-32},new int[]{-2,18,-60,-52,-46,62,-10,82,-24,34,72,50,-98,-96,78,86,6,32,-60},new int[]{-44,-52,-66,-46,24,80,-68,92,-32,26,-44,30,72,-56,-56,28,-26,22,-92},new int[]{82,-58,-60,-30,-68,-18,-72,98,92,-28,-30,44,78,10,54,56,2,-92,24},new int[]{4,96,-84,68,14,-86,6,22,-6,-60,2,-38,-48,48,-74,-52,-44,-68,-96},new int[]{46,4,16,20,-12,86,-56,88,8,-68,56,14,2,-38,-20,-42,-64,86,30},new int[]{96,68,-74,14,66,-20,72,60,56,-78,-14,2,60,16,-2,-90,-46,24,68},new int[]{-80,40,72,-88,-2,12,-96,-34,-88,94,46,-62,84,-68,14,-62,-26,-94,-66},new int[]{24,-60,-30,-22,-42,-2,-52,76,-16,26,-82,64,88,6,-42,-46,36,50,98},new int[]{-30,-16,-80,-16,-42,-6,60,-78,-94,-42,-20,44,-78,70,48,-84,-52,-22,46}});
    param0.add(new int[][]{new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1},new int[]{0,0,0,0,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1},new int[]{0,0,0,0,0,0,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,1,1,1,1,1,1},new int[]{0,0,0,0,1,1,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,1,1,1,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,0,0,1,1,1,1,1},new int[]{0,0,0,0,0,0,0,1,1,1,1,1,1,1},new int[]{0,0,0,1,1,1,1,1,1,1,1,1,1,1}});
    param0.add(new int[][]{new int[]{58,85,97,21,67,89,63,21,3,59,28,4,57,94,75,40,26,76,91,6,64,58,31,26,69,56},new int[]{61,73,86,49,29,98,33,19,25,73,53,43,38,38,35,8,76,31,86,93,82,13,22,28,38,88},new int[]{36,22,61,11,68,82,29,74,11,31,71,46,70,47,91,56,26,34,52,41,82,3,21,59,15,3},new int[]{67,75,36,39,7,71,38,63,36,73,77,63,61,19,58,96,24,71,76,5,92,80,56,51,57,11},new int[]{81,94,93,62,55,71,63,25,30,12,82,98,12,57,44,59,67,18,56,20,37,80,66,57,34,64},new int[]{69,90,68,50,46,79,27,12,24,37,33,24,2,33,50,3,21,20,30,30,27,8,82,99,71,83},new int[]{4,52,66,74,99,99,10,51,25,84,50,37,10,56,36,42,92,89,70,67,17,89,44,63,1,34},new int[]{78,19,58,40,15,68,31,14,96,72,74,34,10,64,69,91,12,65,82,30,20,76,73,22,49,65},new int[]{11,46,64,46,13,96,43,95,47,18,45,16,69,36,53,50,24,68,43,91,31,48,47,1,91,44},new int[]{86,37,91,17,78,5,39,37,62,68,26,91,19,64,42,55,65,56,85,33,90,70,97,51,61,42},new int[]{47,84,97,98,53,58,83,86,30,42,4,72,67,32,50,37,43,92,40,6,1,98,25,16,36,18},new int[]{5,15,23,78,81,92,74,55,30,59,43,27,48,24,33,90,79,61,16,76,13,75,13,91,86,97},new int[]{50,81,63,53,30,92,83,19,43,90,40,66,2,92,72,35,87,11,26,55,26,92,80,79,68,73},new int[]{2,55,80,76,99,98,8,31,23,87,99,75,72,45,79,70,84,36,9,78,44,45,38,96,66,39},new int[]{78,28,1,62,38,69,48,57,89,60,15,7,67,99,63,37,65,27,1,8,17,15,1,39,11,49},new int[]{20,70,15,29,42,31,49,87,50,11,66,55,21,35,77,7,65,3,92,86,52,36,16,55,25,59},new int[]{24,90,55,67,66,96,58,49,21,1,39,30,65,55,57,64,98,27,90,65,43,26,10,77,86,9},new int[]{40,44,98,40,1,40,6,30,39,41,10,55,44,38,44,86,95,80,86,41,40,94,35,46,87,36},new int[]{30,21,73,92,41,17,19,71,53,19,80,65,93,1,69,48,95,54,81,52,50,72,91,9,73,74},new int[]{42,87,8,31,39,47,35,29,70,42,94,53,27,53,67,51,28,86,27,77,8,84,48,34,71,2},new int[]{84,68,18,85,35,63,98,68,95,24,85,10,23,88,15,70,15,46,46,52,4,72,21,75,11,21},new int[]{21,1,28,27,46,61,52,56,43,9,88,19,41,40,12,90,49,56,92,65,3,46,16,46,45,64},new int[]{65,27,31,4,16,63,97,48,45,39,37,7,89,99,19,93,57,16,25,43,80,27,70,63,50,69},new int[]{97,69,6,27,72,96,13,62,99,28,63,5,85,45,67,97,60,65,21,24,85,46,21,6,31,19},new int[]{89,76,25,93,74,3,97,44,8,25,95,57,65,17,32,72,31,85,38,53,76,1,58,41,87,76},new int[]{42,30,40,72,77,45,71,43,39,3,8,52,99,92,80,1,83,60,29,93,9,96,50,73,32,92}});
    List<Integer> param1 = new ArrayList<>();
    param1.add(14);
    param1.add(28);
    param1.add(28);
    param1.add(48);
    param1.add(14);
    param1.add(19);
    param1.add(6);
    param1.add(11);
    param1.add(8);
    param1.add(25);
    List<Integer> param2 = new ArrayList<>();
    param2.add(17);
    param2.add(27);
    param2.add(16);
    param2.add(37);
    param2.add(7);
    param2.add(20);
    param2.add(5);
    param2.add(18);
    param2.add(10);
    param2.add(14);
    for(int i = 0; i < param0.size(); ++i)
    {
        if(f_filled(param0.get(i),param1.get(i),param2.get(i)) == f_gold(param0.get(i),param1.get(i),param2.get(i)))
        {
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}