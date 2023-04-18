# Elland-Test (엘란드온라인 1.12.2 테스트 툴)
## Version

Java 12 버젼 이상을 사용해주세요  
Spigot/Paper Bukkit 1.12.2 버젼을 사용해주세요

## 의존성 플러그인 (없음)

## 실행 방법

해당 플러그인을 서버 디렉토리에 /plugins 에 넣은 뒤  
Paper 혹은 spigot 버킷으로 실행합니다.  

## 플러그인 명령어

● /dpm-start - dpm을 측정합니다. [Permission: Admin] (인게임에서만 사용가능)  
● /테스트몹 <숫자> - 해당 <숫자>만큼 테스트몹을 소환합니다. [Permission: Admin] (인게임에서만 사용가능)  

## CLI 환경에서 실행하기
### `java -Xms3G -Xmx3G -XX:+UseG1GC -XX:+ParallelRefProcEnabled -XX:MaxGCPauseMillis=130 -XX:+UnlockExperimentalVMOptions -XX:+UnlockDiagnosticVMOptions -XX:+DisableExplicitGC -XX:+AlwaysPreTouch -XX:G1NewSizePercent=28 -XX:G1MaxNewSizePercent=40 -XX:G1HeapRegionSize=16M -XX:G1ReservePercent=20 -XX:G1MixedGCCountTarget=3 -XX:InitiatingHeapOccupancyPercent=10 -XX:G1MixedGCLiveThresholdPercent=90 -XX:G1RSetUpdatingPauseTimePercent=0 -XX:SurvivorRatio=32 -XX:+PerfDisableSharedMem -XX:G1SATBBufferEnqueueingThresholdPercent=30 -XX:G1ConcMarkStepDurationMillis=5.0 -XX:G1ConcRSHotCardLimit=16 -XX:MaxTenuringThreshold=1 -XX:G1ConcRefinementServiceIntervalMillis=150 -XX:UseAVX=3 -XX:+UseStringDeduplication -XX:+UseFastUnorderedTimeStamps -XX:+UseAES -XX:GCTimeRatio=99 -XX:+UseAESIntrinsics -XX:UseSSE=4 -XX:+UseFMA -XX:AllocatePrefetchStyle=3 -XX:+UseLoopPredicate -XX:+RangeCheckElimination -XX:+EliminateLocks -XX:+DoEscapeAnalysis -XX:+UseCodeCacheFlushing -XX:+SegmentedCodeCache -XX:+UseFastJNIAccessors -XX:+OptimizeStringConcat -XX:+UseCompressedOops -XX:+UseThreadPriorities -XX:+OmitStackTraceInFastThrow -XX:+TrustFinalNonStaticFields -XX:ThreadPriorityPolicy=1 -XX:+UseInlineCaches -XX:+RewriteBytecodes -XX:+RewriteFrequentPairs -XX:+UseNUMA -XX:-DontCompileHugeMethods -XX:+UseFPUForSpilling -XX:+UseFastStosb -XX:+UseNewLongLShift -XX:+UseVectorCmov -XX:+UseXMMForArrayCopy -XX:+UseXmmI2D -XX:+UseXmmI2F -XX:+UseXmmLoadAndClearUpper -XX:+UseXmmRegToRegMoveAll -XX:+UseLargePages -XX:LargePageSizeInBytes=2m -Xlog:gc+init -Dfile.encoding=UTF-8 -Djava.security.egd=file:/dev/urandom -XX:NmethodSweepActivity=1 -XX:+AlwaysActAsServerClassMachine -XX:ReservedCodeCacheSize=400M -XX:NonNMethodCodeHeapSize=12M -XX:ProfiledCodeHeapSize=194M -XX:NonProfiledCodeHeapSize=194M -XX:MaxNodeLimit=240000 -XX:NodeLimitFudgeFactor=8000 -XX:+UseCriticalJavaThreadPriority --add-modules jdk.incubator.vector -jar paper-1.12.2-1620.jar`
.jar 파일로 된 Spigot/Paper Bukkit을 실행합니다.   
