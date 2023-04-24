# java-fundamentals

Code Fellows 401 Labs 1-10

## Changelog

### 2023-04-24T18:23-08:00

- Added `inheritance` directory with Lab 06 assignment which contains the functions and tests shown in the tree below.

```bash
├───inheritance
│   └───lib
│       └───src
│           ├───main
│           │   ├───java
│           │   │   └───inheritance
│           │   │       └───Restaurant
│           │   │       |   └───addReview()
│           │   │       |   └───toString()
│           │   │       |   └───getStars()
│           │   │       |   └───getName()
│           │   │       |   └───getPriceCategory()
│           │   │       |   └───getReviews()
│           │   │       └───Review
│           │   │           └───addReview()
│           │   │           └───toString()
│           │   │           └───getStars()
│           │   │           └───updateStars()
│           │   │           └───getBody()
│           │   │           └───getRestaurant()
│           └───test
│               ├───java
│               │   └───inheritance
│               │       └───RestaurantTest
│               │       |   └───testConstructor()
│               │       |   └───testConstructorThrowsIllegalArgumentException()
│               │       |   └───testToString()
│               │       |   └───testRestaurantReviewAssociation()
│               │       |   └───testStarRatingUpdate()
│               │       |   └───getReviews()
│               │       └───ReviewTest
│               │           └───testConstructor()
│               │           └───testConstructorThrowsIllegalArgumentException()
│               │           └───testToString()
│               └───resources
```

### 2023-04-19T18:20-08:00

- Added `linter` directory with Lab 03 assignment which contains the functions and tests shown in the tree below.
- Added `analyzeWeatherData()`, `tally()`, and `updateVotes` functions to `basiclibrary`, along with associated tests.

```bash
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

### 2023-04-18T16:20-08:00

- Added `basiclibrary` directory with Lab 02 assignment which contains the functions and tests shown in the tree below

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
```

### 2023-04-17T13:46-08:00

- Added `basics` directory with Lab 01 assignment which contains the functions shown in the tree below

```bash
└───basics
│   └───pluralize()
│   └───flipNHeads()
│   └───clock()
```
