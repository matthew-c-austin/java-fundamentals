# java-fundamentals

Code Fellows 401 Labs 1-10

## Changelog

2023-04-19T18:20-08:00

- Added `linter` directory with Lab 03 assignment which contains the functions and tests shown in the tree below.
- Added `analyzeWeatherData()`, `tally()`, and `updateVotes` functions to `basiclibrary`, along with associated tests.

2023-04-18T16:20-08:00 - Added `basiclibrary` directory with Lab 02 assignment which contains the functions and tests shown in the tree below

2023-04-17T13:46-08:00 - Added `basics` directory with Lab 01 assignment which contains the functions shown in the tree below

## List of Files and Methods

```bash
├───basiclibrary
│   └───lib
│       └───src
│           ├───main
│           │   ├───java
│           │   │   └───basiclibrary
│           │   │       └───roll()
│           │   │       └───containsDuplicates()
│           │   │       └───calculateAverage()
│           │   │       └───findSmallestSubarray()
│           │   │       └───analyzeWeatherData()
│           │   │       └───tally()
│           │   │       └───updateVotes()
│           └───test
│               ├───java
│               │   └───basiclibrary
│               │       └───testNumberOfRolls()
│               │       └───testRollsRange()
│               │       └───testRollIllegalArgumentException()
│               │       └───testContainsDuplicatesIsTrue()
│               │       └───testContainsDuplicatesIsFalse()
│               │       └───testContainsDuplicatesIllegalArgumentException()
│               │       └───testCalculateAverageWithDelta()
│               │       └───testCalculateAverageIllegalArgumentException()
│               │       └───testFindSmallestSubarray()
│               │       └───testFindSmallestSubarrayOuterArrayIllegalArgumentException()
│               │       └───testFindSmallestSubarrayInnerArrayIllegalArgumentException()
│               │       └───testAnalyzeWeatherDataUnseenTemperatures()
│               │       └───testAnalyzeWeatherDataOuterArrayIllegalArgumentException()
│               │       └───testAnalyzeWeatherDataInnerArrayIllegalArgumentException()
│               │       └───testTallForSingleWinner()
│               │       └───testTallyForTie()
│               │       └───testTallyForEmptyList()
│               │       └───testTallyForEmptyString()
│               │       └───testUpdateVotesForExistingCandidate()
│               │       └───testUpdateVotesForNewCandidate()
│               └───resources
└───basics
│   └───pluralize()
│   └───flipNHeads()
│   └───clock()
├───linter
│   └───app
│       └───src
│           ├───main
│           │   ├───java
│           │   │   └───linter
│           │   │   |   └───main()
│           │   │   |   └───runLinter()
│           │   │   |───resources
│           └───test
│               ├───java
│               │   └───linter
│               │   |   └───testMainThrowsExceptionWithNoArguments()
│               │   |   └───testMainThrowsExceptionWithWrongNumberOfArguments()
│               │   |   └───testMainThrowsExceptionWithWrongNumberOfArguments()
│               │   |   └───testRunLinterNoErrors()
│               │   |   └───testRunLinterFewErrors() 
│               │   |   └───testRunLinterManyErrors()
│               │   |   └───testRunLinterEmptyFile()
│               │   |───resources
```
