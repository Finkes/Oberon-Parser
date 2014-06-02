#!/bin/bash

for f in *.dot
do
  echo "Processing $f file..."
  # take action on each file. $f store current file name
  dot -Tsvg $f -o "../export/$f.svg"
done
