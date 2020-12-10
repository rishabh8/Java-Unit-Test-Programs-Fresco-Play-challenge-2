#!/bin/sh
SCORE=0
PASS=0
TEST_1=$(grep -io 'failures="0"' ./target/surefire-reports/*.xml |wc -l) >=1
TEST_2=$(grep -io 'errors="0"' ./target/surefire-reports/*.xml |wc -l) >=1
if [ "$TEST_1" -eq 1 ]
then PASS=$((PASS + 1))
fi;
if [ "$TEST_2" -eq 1 ] 
then PASS=$((PASS + 1))
fi;
SCORE=$(($PASS * 50))
echo "FS_SCORE:$SCORE%"