<map version="0.9.0">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1349452616270" ID="ID_1133575979" MODIFIED="1349457029747" TEXT="tdk">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      Hol mutassam be, hogy ez az &#233;n munk&#225;m?
    </p>
  </body>
</html></richcontent>
<node COLOR="#ff6666" CREATED="1349452708177" ID="ID_588802986" MODIFIED="1349726053926" POSITION="right" STYLE="fork" TEXT="Introduction (2p)">
<node CREATED="1349454418688" ID="ID_1127936123" MODIFIED="1349455526336" TEXT="CERN control systems">
<node CREATED="1349454814200" ID="ID_426053451" MODIFIED="1349455526336" TEXT="What is CERN"/>
<node CREATED="1349454818405" ID="ID_1608873333" MODIFIED="1349455526336" TEXT="Complexity of controls systems"/>
<node CREATED="1349454457965" ID="ID_1576361924" MODIFIED="1349455526336" TEXT="Main goals"/>
</node>
<node CREATED="1349454798030" ID="ID_335750623" MODIFIED="1349455526336" TEXT="Smooth upgrades">
<node CREATED="1349454877739" ID="ID_1347512131" MODIFIED="1349455526336" TEXT="What is a smooth upgrades"/>
<node CREATED="1349454889999" ID="ID_1581372055" MODIFIED="1349455526336" TEXT="How to achieve this goal">
<node CREATED="1349454969295" ID="ID_1959715188" MODIFIED="1349455526336" TEXT="methods"/>
<node CREATED="1349454971683" ID="ID_675648626" MODIFIED="1349455526336" TEXT="metrics"/>
<node CREATED="1349454974833" ID="ID_1628727939" MODIFIED="1349455526336" TEXT="communication"/>
<node CREATED="1349454979633" ID="ID_604542887" MODIFIED="1349455526336" TEXT="incoming dependencies"/>
</node>
</node>
<node CREATED="1349454595189" ID="ID_834794681" MODIFIED="1349455559530" TEXT="Incoming dependencies">
<node CREATED="1349454992311" ID="ID_718711701" MODIFIED="1349455638564" TEXT="introduce it by example (Vito&apos;s article)"/>
<node CREATED="1349455025693" ID="ID_1285213075" MODIFIED="1349455526336" TEXT="my tool gives a way to access this information"/>
<node CREATED="1349455037192" ID="ID_793767385" MODIFIED="1349455526336" TEXT="why it exists: no off-the-shelf solution">
<node CREATED="1349695775700" ID="ID_602312366" MODIFIED="1349695780460" TEXT="specific usecase"/>
<node CREATED="1349695780988" ID="ID_1257970895" MODIFIED="1349695788780" TEXT="closed-world semantics"/>
</node>
<node CREATED="1349455056592" ID="ID_1176658171" MODIFIED="1349455526336" TEXT="chapter description"/>
</node>
</node>
<node COLOR="#ff6666" CREATED="1349452731760" ID="ID_1956038418" MODIFIED="1349455926579" POSITION="right" TEXT="Background(10p)">
<node CREATED="1349455665016" ID="ID_236615527" MODIFIED="1349731355773" TEXT="Related Technologies">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      Before we proceed, let's
    </p>
  </body>
</html>
</richcontent>
<node CREATED="1349456119965" ID="ID_1260836808" MODIFIED="1349726148796" TEXT="Java runtime">
<node CREATED="1349456145913" ID="ID_1821429294" MODIFIED="1349456154505" TEXT="Java Byte Code"/>
<node CREATED="1349456169047" ID="ID_78729996" MODIFIED="1349456171669" TEXT="BCEL"/>
</node>
<node CREATED="1349456100121" ID="ID_651478493" MODIFIED="1349726148276" TEXT="Eclipse">
<node CREATED="1349456102173" ID="ID_1793670403" MODIFIED="1349456107943" TEXT="IDE"/>
<node CREATED="1349639548734" ID="ID_1140372553" MODIFIED="1349639550936" TEXT="JDT"/>
<node CREATED="1349456108651" ID="ID_1009356800" MODIFIED="1349456110693" TEXT="EMF">
<node CREATED="1349731358790" ID="ID_182987218" MODIFIED="1349731366453" TEXT="brief description"/>
<node CREATED="1349731367177" ID="ID_659561757" MODIFIED="1349731376305" TEXT="modeling and metamodeling"/>
</node>
</node>
<node CREATED="1349456176601" FOLDED="true" ID="ID_87179803" MODIFIED="1349726109856" TEXT="Other, implementation-specific technologies">
<node CREATED="1349456205053" ID="ID_1825618693" MODIFIED="1349456209165" TEXT="Spring"/>
<node CREATED="1349456212103" ID="ID_1107290523" MODIFIED="1349456213315" TEXT="Maven"/>
<node CREATED="1349456216643" ID="ID_226483377" MODIFIED="1349456218775" TEXT="Tycho"/>
<node CREATED="1349456218983" ID="ID_1058445986" MODIFIED="1349456223145" TEXT="Oracle"/>
</node>
</node>
<node CREATED="1349455655544" ID="ID_51689455" MODIFIED="1349731354790" TEXT="Example: Service Provider Framework">
<node CREATED="1349455933901" ID="ID_1046474791" MODIFIED="1349455964505" TEXT="Example to show the problem with the incoming dependencies and how my tool solves it"/>
<node CREATED="1349456029479" ID="ID_1445984428" MODIFIED="1349456075611" TEXT="This code basicaly from the book &quot;Effective Java&quot; from Joshua Bloch"/>
<node CREATED="1349455972253" ID="ID_854712652" MODIFIED="1349455994595" TEXT="Description of the server classes"/>
<node CREATED="1349455997333" ID="ID_1039390662" MODIFIED="1349456013587" TEXT="Description of the implmenetation classes"/>
<node CREATED="1349456005153" ID="ID_918055434" MODIFIED="1349456023671" TEXT="Desciption of the clint classes"/>
</node>
</node>
<node CREATED="1349454278808" ID="ID_19162639" MODIFIED="1349454304263" POSITION="right" TEXT="Overview(3p)">
<node COLOR="#ff6666" CREATED="1349456258435" ID="ID_754502244" MODIFIED="1349457138319" TEXT="Dependency Analysis Software">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      Dep. An Tool? Dep. An Framework?
    </p>
  </body>
</html></richcontent>
<node CREATED="1349457130677" ID="ID_275780060" MODIFIED="1349457134109" TEXT="Introduction">
<node CREATED="1349457141819" ID="ID_203140934" MODIFIED="1349457183561" TEXT="My tool for solve the problem described in the previous chapter"/>
<node CREATED="1349457188879" ID="ID_309637038" MODIFIED="1349457225073" TEXT="Figure shows the layout">
<node CREATED="1349457225073" ID="ID_857321447" MODIFIED="1349457262245" TEXT="Three parts (infrastructure, server side, client side)"/>
<node CREATED="1349457238491" ID="ID_1680665561" MODIFIED="1349457284537" TEXT="The original implementation was done at CERN">
<node CREATED="1349457286015" ID="ID_282722898" MODIFIED="1349457337281" TEXT="Ability to query incoming dependencies from the source code "/>
<node CREATED="1349457309947" ID="ID_387646927" MODIFIED="1349457332831" TEXT="blue boxes."/>
</node>
<node CREATED="1349457338099" ID="ID_1385573499" MODIFIED="1349457384571" TEXT="Extension developed at the university">
<node CREATED="1349457385349" ID="ID_1317802410" MODIFIED="1349457389641" TEXT="Pattern-based queries"/>
<node CREATED="1349457390581" ID="ID_1220058899" MODIFIED="1349457397443" TEXT="red boxes"/>
</node>
</node>
</node>
<node CREATED="1349456574594" ID="ID_1705374416" MODIFIED="1349457401483" TEXT="Infrastructure">
<node CREATED="1349456609174" ID="ID_1499157857" MODIFIED="1349456625726" TEXT="Developer&apos;s use Eclipse plugin"/>
<node CREATED="1349456626544" ID="ID_996247853" MODIFIED="1349456634916" TEXT="Commonbuild">
<node CREATED="1349456636434" ID="ID_1095873644" MODIFIED="1349456642276" TEXT="Attached to SVN "/>
<node CREATED="1349456642874" ID="ID_1307349867" MODIFIED="1349456669006" TEXT="Release management tool">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      Megkeresni a commonbuild-es linket.
    </p>
  </body>
</html></richcontent>
</node>
<node CREATED="1349456766180" ID="ID_1300279972" MODIFIED="1349456779774" TEXT="Binary repository for the released products"/>
</node>
</node>
<node CREATED="1349456607274" ID="ID_891478551" MODIFIED="1349456727006" TEXT="Server process">
<node CREATED="1349456750196" ID="ID_1228736659" MODIFIED="1349456762000" TEXT="Finds jar files in the commonbuild"/>
<node CREATED="1349456789832" ID="ID_1600048790" MODIFIED="1349456806036" TEXT="Structure and dependency extraction on the server side"/>
<node CREATED="1349456806484" FOLDED="true" ID="ID_392955428" MODIFIED="1349456934729" TEXT="Database module for storing structure and find dependencies">
<node CREATED="1349456824086" ID="ID_48948783" MODIFIED="1349456833088" TEXT="multiple backend implementation"/>
<node CREATED="1349456833686" ID="ID_1137337475" MODIFIED="1349456848968" TEXT="High level operations"/>
</node>
<node CREATED="1349456946221" ID="ID_1497930049" MODIFIED="1349456974233" TEXT="RMI interface for receiving queries and retrieving the results"/>
</node>
<node CREATED="1349456586084" ID="ID_119515448" MODIFIED="1349456736138" TEXT="Client plugin">
<node CREATED="1349457804738" ID="ID_466367012" MODIFIED="1349457830020" TEXT="Two implementations">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      created at CERN and at the University
    </p>
  </body>
</html></richcontent>
<node CREATED="1349457695765" ID="ID_1000257724" MODIFIED="1349457832610" TEXT="original implementation direct queries">
<node CREATED="1349457748927" ID="ID_49523214" MODIFIED="1349457767840" TEXT="user requests the incoming dependencies"/>
<node CREATED="1349457768468" ID="ID_1904973842" MODIFIED="1349457775350" TEXT="Client initiates a query "/>
<node CREATED="1349457776028" ID="ID_1556497012" MODIFIED="1349457786670" TEXT="server retrieves all the incoming dependencies from the database"/>
<node CREATED="1349457787368" ID="ID_1798479519" MODIFIED="1349457799760" TEXT="Plugin visualizes it in a separate editor"/>
</node>
<node CREATED="1349457833568" ID="ID_1116903460" MODIFIED="1349457839930" TEXT="extension">
<node CREATED="1349457856414" ID="ID_15524625" MODIFIED="1349457922712" TEXT="asks the server for an EMF instance model which describes the binary repository structure and the dependencies"/>
<node CREATED="1349457927520" ID="ID_1169623266" MODIFIED="1349457955482" TEXT="Creates an EMF model about the workspace state: all the included projecs"/>
<node CREATED="1349457957060" ID="ID_49150306" MODIFIED="1349458029286" TEXT="EMF-incquery patterns find the all the dependency information by joining and filtering the two models"/>
</node>
</node>
</node>
</node>
</node>
<node CREATED="1349454311919" ID="ID_925230948" MODIFIED="1349639459046" POSITION="right" TEXT="Elaboration(20p)">
<node CREATED="1349640412549" ID="ID_1866835248" MODIFIED="1349640460814" TEXT="Workflow">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      describe in greater detail how the process workflow works
    </p>
  </body>
</html></richcontent>
</node>
<node CREATED="1349458076524" ID="ID_97907642" MODIFIED="1349732627909" TEXT="Byte Code Analysis">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      Also add the example in this part
    </p>
  </body>
</html></richcontent>
<node CREATED="1349458098354" ID="ID_1878719889" MODIFIED="1349458121202" TEXT="Why don&apos;t we want to work with the surce code"/>
<node CREATED="1349458121830" ID="ID_1028027661" MODIFIED="1349458151424" TEXT="What is the structure of the binary code"/>
<node CREATED="1349458137112" ID="ID_8738470" MODIFIED="1349458174134" TEXT="What kind of  information can we obtain ftom the bytecode">
<node CREATED="1349458175662" ID="ID_1107166184" MODIFIED="1349458216854" TEXT="restriction: just static dependencies"/>
</node>
</node>
<node CREATED="1349458258752" ID="ID_20441763" MODIFIED="1349639432497" TEXT="Persisting dependency information">
<node CREATED="1349458306864" ID="ID_1581631926" MODIFIED="1349458314466" TEXT="Problem size"/>
<node CREATED="1349458314974" ID="ID_370851509" MODIFIED="1349458321528" TEXT="Abstract operations"/>
<node CREATED="1349458322266" ID="ID_1700146519" MODIFIED="1349639305591" TEXT="Implementations">
<node CREATED="1349639323829" ID="ID_1436246503" MODIFIED="1349639329475" TEXT="oracle database"/>
<node CREATED="1349639330325" ID="ID_534202429" MODIFIED="1349639332659" TEXT="EMF"/>
<node CREATED="1349639333415" ID="ID_1293992955" MODIFIED="1349639343834" TEXT="Mention graph database"/>
</node>
</node>
<node CREATED="1349639433470" ID="ID_1936662685" MODIFIED="1349639453239" TEXT="Server-client communication">
<node CREATED="1349640309679" ID="ID_1034742906" MODIFIED="1349640342710" TEXT="Load necessary information from the server process to the client plugins"/>
<node CREATED="1349640343514" ID="ID_1877721034" MODIFIED="1349640367528" TEXT="RMI-based, to pass Java objects one-to-one"/>
</node>
<node CREATED="1349639460948" ID="ID_140076883" MODIFIED="1349639515677" TEXT="Direct queries"/>
<node CREATED="1349639516257" ID="ID_886774305" MODIFIED="1349639535119" TEXT="Workspace EMF model generation"/>
<node CREATED="1349639535883" ID="ID_1841255250" MODIFIED="1349640141136" TEXT="Pattern matching"/>
</node>
<node CREATED="1349454329199" ID="ID_656838106" MODIFIED="1349454387962" POSITION="right" TEXT="Evaluation (3-4p)">
<node CREATED="1349454353876" ID="ID_637625047" MODIFIED="1349454362186" TEXT="Functional evaluation">
<node CREATED="1349640160546" ID="ID_285613000" MODIFIED="1349640167004" TEXT="Direct queries"/>
<node CREATED="1349640167672" ID="ID_818046864" MODIFIED="1349640174748" TEXT="Pattern queries"/>
</node>
<node CREATED="1349454365916" ID="ID_454748966" MODIFIED="1349454372388" TEXT="Performance evaluation">
<node CREATED="1349640178468" ID="ID_807157540" MODIFIED="1349640186728" TEXT="How fast is the system"/>
<node CREATED="1349640187906" ID="ID_1042715982" MODIFIED="1349640198488" TEXT="How scalable"/>
<node CREATED="1349642312098" ID="ID_1044506986" MODIFIED="1349642325797" TEXT="real measurements: what is the rate of false positive results"/>
</node>
</node>
<node CREATED="1349454390354" ID="ID_139115986" MODIFIED="1349454410446" POSITION="right" TEXT="Conclusion &amp; Future work (1p)">
<node CREATED="1349458051384" ID="ID_1711245988" MODIFIED="1349640217059" TEXT="What did I achieve">
<node CREATED="1349642779157" ID="ID_696420237" MODIFIED="1349642791365" TEXT="Who can benefit from this tool">
<node CREATED="1349642798988" ID="ID_510444949" MODIFIED="1349642805250" TEXT="library developer"/>
<node CREATED="1349642805871" ID="ID_725076992" MODIFIED="1349642822999" TEXT="where lots of dependant software are manintained"/>
<node CREATED="1349642823660" ID="ID_1847423676" MODIFIED="1349642835236" TEXT="smooth upgrade is essential"/>
</node>
<node CREATED="1349640217802" ID="ID_191595393" MODIFIED="1349640231479" TEXT="Two possible model queries">
<node CREATED="1349642247114" ID="ID_486399048" MODIFIED="1349642261293" TEXT="precise dependency queries"/>
<node CREATED="1349642261975" ID="ID_855005419" MODIFIED="1349642307780" TEXT="fast response with some false negative results"/>
</node>
</node>
<node CREATED="1349640200412" ID="ID_771062416" MODIFIED="1349640235834" TEXT="Future goals">
<node CREATED="1349640236488" ID="ID_1417067887" MODIFIED="1349640237861" TEXT="slicing the server model"/>
<node CREATED="1349650643786" ID="ID_775050251" MODIFIED="1349650668396" TEXT="nofitication about repo model change">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      now the repo model is loaded at startup
    </p>
  </body>
</html></richcontent>
</node>
<node CREATED="1349640238480" ID="ID_1202811069" MODIFIED="1349640252444" TEXT="Create more precise dependency information"/>
</node>
</node>
</node>
</map>
