package _chap09;

public class OrderExam {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      
      MemberDTO m1= new MemberDTO();
      MemberDTO m2= new MemberDTO();
      MemberDTO m3= new MemberDTO();
      
      m1.setName("최민수");
      m1.setAge(20);
      
      m1.setName("박춘보");
      m1.setAge(22);
      
      m1.setName("차수");
      m1.setAge(21);
      
      System.out.println(m1.getAge()>m2.getAge());
      
      MemberDTO m4 = compareMemberDTO(m1, m2);
      System.out.println(m4);
   }
   /**
    * 기능 : 둘중에 나이가 큰 MemberDTO를 돌려줌
    * @param MemberDTO, MemberDTO
    * @return MemberDTO
    */
   
   static MemberDTO compareMemberDTO(MemberDTO dto1, MemberDTO dto2) {
      if(dto1.getAge()>dto2.getAge()) {
         return dto1;
      }else {
         return dto2;
      }
   }

}
