<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/mes/CSS/button.css">
    <link rel="stylesheet" href="/mes/CSS/calender.css">
    <link rel="stylesheet" href="/mes/CSS/common.css">
    <link rel="stylesheet" href="/mes/CSS/display.css">
    <link rel="stylesheet" href="/mes/CSS/mobile.css">
    <link rel="stylesheet" href="/mes/CSS/sidebar.css">
    <link rel="stylesheet" href="/mes/CSS/table.css">
    <link rel="stylesheet" href="/mes/CSS/topbar.css">
    <link rel="stylesheet" href="/mes/CSS/게시판.css">
    <link rel="stylesheet" href="/mes/CSS/mobile.css">
    <script src="/mes/JavaScript/load_info.js"></script>
    <title>소원을 들어주는 MES</title>
</head>

<body>
    <!-- 사이드바 -->
    <div class="sidebar">
        <a href="main">
            <img class="Logo"
                src="/mes/Image/로고.png"
                alt=""></a>

        <div class="profile" id="bos">
            <img src="/mes/Image/정근승.png"
                alt="프로필 사진">
            <h2>정근승</h2>
            <p>대표이사</p>
            <input type="button" value="로그아웃" class="btn" onclick="location.href='login'">

            <div class="profile_btn">
                <input type="button" value="마이페이지" class="btn">
                <input type="button" value="관리자페이지" class="btn" onclick="location.href='관리자'">
            </div>
        </div>

        <div class="profile" id="kwon">
            <img src="/mes/Image/권대호.png"
                alt="프로필 사진">
            <h2>권대호</h2>
            <p>상무</p>
            <input type="button" value="로그아웃" class="btn" onclick="location.href='login'">

            <div class="profile_btn">
                <input type="button" value="마이페이지" class="btn">
                <input type="button" value="관리자페이지" class="btn" onclick="location.href='관리자'">
            </div>
        </div>

        <div class="profile" id="daall">
            <img src="/mes/Image/정다올.png"
                alt="프로필 사진">
            <h2>정다올</h2>
            <p>생산관리팀 부장</p>

            <div class="profile_btn">
                <input type="button" value="마이페이지" class="btn">
                <input type="button" value="로그아웃" class="btn" onclick="location.href='login'">
            </div>
        </div>

        <div class="profile" id="sowon">
            <img src="/mes/Image/김소원.png"
                alt="프로필 사진">
            <h2>김소원</h2>
            <p>생산팀 부장</p>
            
            <div class="profile_btn">
                <input type="button" value="마이페이지" class="btn">
                <input type="button" value="로그아웃" class="btn" onclick="location.href='login'">
            </div>
        </div>




        <div class="cal_kwon">
            <div id="calendar"></div>
            <script src="/mes/JavaScript/calendar_nomall.js"></script>
        </div>

        <h3>열어본 페이지 목록</h3>
        <ul>
            <li>
                <a href="#가장최근에 열어본 페이지">재고관리</a>
            </li>
            <li>
                <a href="#열어본 페이지">생산관리</a>
            </li>
        </ul>

    </div>

    <!--/////////////////////////////////////////////////////////////-->
    <!-- 메인 영역의 큰 div ->이유는 body에 flex를 적용하여 -->
    <div class="content">
        <!--메뉴바-->
        <div class="menu">
            <ul>
                <!--상위 메뉴-->
                <li class="menu-item">
                    <a href="#">정보/BOM</a>
                    <div class="submenu">
                        <ul>
                            <!--하위메뉴-->
                            <li><a href="BOM">BOM</a></li>
                            <li class="manager"><a href="설비코드">설비코드</a></li>
                            <li><a href="조직도">조직도</a></li>
                            <li><a href="문서관리">BOM문서관리(양식서)</a></li>
                        </ul>
                    </div>
                </li>
                <li class="menu-item">
                    <a href="#">재고관리</a>
                    <div class="submenu">
                        <ul>
                            <li><a href="자재관리">자재입출고(자재관리)</a></li>
                            <li class="manager"><a href="재고관리">재고관리</a></li>
                            <li><a href="저장위치">저장위치(MAP)</a></li>
                        </ul>
                    </div>
                </li>

                <li class="menu-item manager">
                    <a href="#">품질관리</a>
                    <div class="submenu">
                        <ul>
                            <li><a href="시험항목_품질기준">제품별 시험항목/품질기준</a></li>
                            <li><a href="생산검사현황">생산검사현황</a></li>
                            <li><a href="검사현황">검사현황</a></li>
                        </ul>
                    </div>
                </li>

                <li class="menu-item">
                    <a href="#">생산관리</a>
                    <div class="submenu">
                        <ul>
                            <li><a href="생산계획목록">생산계획목록</a></li>
                            <li><a href="작업지시서목록">작업지시목록</a></li>
                            <li><a href="생산실적">생산실적</a></li>
                            <li><a href="생산실적보고서">생산실적보고서</a></li>
                        </ul>
                    </div>
                </li>

                <li class="menu-item manager">
                    <a href="#">설비관리</a>
                    <div class="submenu">
                        <ul>
                            <li><a href="공정별설비관리">공정별설비관리/수리보고서</a></li>
                            <li><a href="설비고장_수리이력">설비고장/수리이력</a></li>
                            <li><a href="비가동이력">비가동이력</a></li>
                        </ul>
                    </div>
                </li>
            </ul>

        </div>
        <hr>
        <!-- 메인메뉴 아레 정보가 표시될 영역 -->
        <div class="searchID">

            <!-- 해당 페이지의 제목 -->
            <h1>자재입출고관리</h1>
            <!-- 해당 페이지의 설명 -->
            <div class="subhead">
                <span>자재를 입/출고 날짜 별로 조회하여 관리하는 페이지입니다.</span> <br>
            </div>
            <!-- 게시물의 개수를 표시할 select -->
            <div class="cntdiv">
                <span>게시물</span>
                 <select name="cnt" id="cnt" onchange="changePageSize()">
                    <option value="10">10개씩</option>
                    <option value="20">20개씩</option>
                    <option value="30">30개씩</option>
                    <option value="40">40개씩</option>
                    <option value="50" selected>50개씩</option>
                </select>
                <br>
                <div class="divbtn">
                    <button class="btn" onclick="showAllRows()">전체</button>
                    <button class="btn" onclick="filterByStatus('검사전')">검사전</button>
                    <button class="btn" onclick="filterByStatus('검사중')">검사중</button>
                    <button class="btn" onclick="filterByStatus('검사완료')">검사완료</button>
                </div>
                <div>
                    <button onclick="delchk()" class="btn Lbtn">선택된 열 삭제</button>
                    <span>날짜별 조회</span>
                    <input type="date" id="startdate"> ~ <input type="date" id="enddate">
                    <button class="btn">검색</button>
                </div>

            </div>
        </div>

        <!-- 해당 목록 -->
        <div class="tableID">
            <table>
                <thead>
                    <tr>
                        <th><input type="checkbox" id="allchk"></th>
                        <th>번호</th>
                        <th>제품번호</th>
                        <th>LOT 번호</th>
                        <th>제품명</th>
                        <th>규격</th>
                        <th>단위(kg)</th>
                        <th>검사상태</th>
                        <th>입고날짜</th>
                        <th>출고날짜</th>
                        <th>검수자</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><input type="checkbox" id="tablechk"></td>
                        <td>1</td>
                        <td>00021</td>
                        <td>GC19002</td>
                        <td>폴리에텔렌</td>
                        <td>PE100</td>
                        <td>801</td>
                        <td>검사완료</td>
                        <td>24.07.19</td>
                        <td>24.07.21</td>
                        <td>정다올</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" id="tablechk"></td>
                        <td>2</td>
                        <td>00022</td>
                        <td>SC19003</td>
                        <td>폴리에텔렌</td>
                        <td>PE80</td>
                        <td>902</td>
                        <td>검사중</td>
                        <td>24.07.20</td>
                        <td>24.07.31</td>
                        <td>정근승</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" id="tablechk"></td>
                        <td>3</td>
                        <td>00023</td>
                        <td>SC19004</td>
                        <td>폴리에텔렌</td>
                        <td>PE100</td>
                        <td>328</td>
                        <td>검사전</td>
                        <td>24.07.19</td>
                        <td>24.07.25</td>
                        <td>권대호</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" id="tablechk"></td>
                        <td>4</td>
                        <td>00021</td>
                        <td>GC19002</td>
                        <td>폴리에텔렌</td>
                        <td>PE80</td>
                        <td>801</td>
                        <td>검사완료</td>
                        <td>24.07.19</td>
                        <td>24.07.21</td>
                        <td>정근승</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" id="tablechk"></td>
                        <td>5</td>
                        <td>00022</td>
                        <td>SC19003</td>
                        <td>폴리에텔렌</td>
                        <td>PE100</td>
                        <td>902</td>
                        <td>검사중</td>
                        <td>24.07.20</td>
                        <td>24.07.31</td>
                        <td>박경민</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" id="tablechk"></td>
                        <td>6</td>
                        <td>00023</td>
                        <td>SC19004</td>
                        <td>폴리에텔렌</td>
                        <td>PE80</td>
                        <td>328</td>
                        <td>검사전</td>
                        <td>24.07.19</td>
                        <td>24.07.25</td>
                        <td>최영준</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" id="tablechk"></td>
                        <td>7</td>
                        <td>00024</td>
                        <td>SC19005</td>
                        <td>폴리에텔렌</td>
                        <td>PE100</td>
                        <td>500</td>
                        <td>검사완료</td>
                        <td>24.07.21</td>
                        <td>24.07.22</td>
                        <td>서수찬</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" id="tablechk"></td>
                        <td>8</td>
                        <td>00025</td>
                        <td>SC19006</td>
                        <td>폴리에텔렌</td>
                        <td>PE80</td>
                        <td>700</td>
                        <td>검사중</td>
                        <td>24.07.22</td>
                        <td>24.07.29</td>
                        <td>김승환</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" id="tablechk"></td>
                        <td>9</td>
                        <td>00026</td>
                        <td>GC19007</td>
                        <td>폴리에텔렌</td>
                        <td>PE100</td>
                        <td>1200</td>
                        <td>검사전</td>
                        <td>24.07.23</td>
                        <td>24.07.27</td>
                        <td>조민정</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" id="tablechk"></td>
                        <td>10</td>
                        <td>00027</td>
                        <td>SC19008</td>
                        <td>폴리에텔렌</td>
                        <td>PE80</td>
                        <td>300</td>
                        <td>검사완료</td>
                        <td>24.07.24</td>
                        <td>24.07.28</td>
                        <td>김성령</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" id="tablechk"></td>
                        <td>11</td>
                        <td>00028</td>
                        <td>SC19009</td>
                        <td>폴리에텔렌</td>
                        <td>PE100</td>
                        <td>1500</td>
                        <td>검사중</td>
                        <td>24.07.25</td>
                        <td>24.07.30</td>
                        <td>박규태</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" id="tablechk"></td>
                        <td>12</td>
                        <td>00029</td>
                        <td>SC19010</td>
                        <td>폴리에텔렌</td>
                        <td>PE80</td>
                        <td>4500</td>
                        <td>검사전</td>
                        <td>24.07.26</td>
                        <td>24.07.31</td>
                        <td>이제섭</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" id="tablechk"></td>
                        <td>13</td>
                        <td>00030</td>
                        <td>SC19011</td>
                        <td>폴리에텔렌</td>
                        <td>PE100</td>
                        <td>2600</td>
                        <td>검사완료</td>
                        <td>24.07.27</td>
                        <td>24.08.01</td>
                        <td>박규태</td>
                    </tr>
                </tbody>
            </table>
            
        </div>


        <hr>
        <div class="pagenum">
            <a id="a1" href="">1</a>
            <a href="">2</a>
            <a href="">3</a>
            <a href="">4</a>
            <a href="">5</a>
            <a href="">6</a>
            <a href="">7</a>
        </div>


    </div>

</body>
<script src="/mes/JavaScript/sort.js"></script>
<script src="/mes/JavaScript/date.js"></script>
<script src="/mes/JavaScript/button.js"></script>
</html>