
ROBOCOPY %1 %2 /E /S /LOG:%3

RD /S /Q %1

ROBOCOPY %2 %1 /E /S /LOG:%3

RD /S /Q %2 