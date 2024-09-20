using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Calc
{
    public partial class Form1 : Form
    {
        //private double firstNumber = 0;  // 첫 번째 숫자
        //private double secondNumber = 0; // 두 번째 숫자
        private string[] N = new string[100];
        private int index = 0;
        private string operation = "";
        private double result = 0; // 값 출력을 위해 필드영역에 선언
        public Form1()
        {
            InitializeComponent();
        }
        private void btn1_Click(object sender, EventArgs e)
        {
            display.Text += "1";
        }

        private void btn7_Click(object sender, EventArgs e)
        {
            display.Text += "7";
        }

        private void btn8_Click(object sender, EventArgs e)
        {
            display.Text += "8";
        }

        private void btn9_Click(object sender, EventArgs e)
        {
            display.Text += "9";
        }

        private void btn2_Click(object sender, EventArgs e)
        {
            display.Text += "2";
        }

        private void btn4_Click(object sender, EventArgs e)
        {
            display.Text += "4";
        }

        private void btn3_Click(object sender, EventArgs e)
        {
            display.Text += "3";
        }

        private void btn5_Click(object sender, EventArgs e)
        {
            display.Text += "5";
        }

        private void btn6_Click(object sender, EventArgs e)
        {
            display.Text += "6";
        }

        private void btn0_Click(object sender, EventArgs e)
        {
            display.Text += "0";
        }


        private void btnAC_Click(object sender, EventArgs e)
        {
            //모든값을 초기화 한다.
            display.Text = "0";  // 디스플레이를 초기화
            result = 0; // 결과 초기화
            index = 0; // 인덱스 초기화
            Array.Clear(N, 0, N.Length); // 배열 초기화
            operation = ""; // 연산자 초기화
        }
        private void btnPlus_Click(object sender, EventArgs e)
        {
            N[index] = display.Text;  // 배열에 현재 입력된 숫자를 저장
            index++;
            operation = "+";
            display.Text = "";  // 디스플레이 초기화
        }

        private void btnMinus_Click(object sender, EventArgs e)
        {
            N[index] = display.Text;
            index++;
            operation = "-";  // 연산자를 저장
            display.Text = "";  // 디스플레이 초기화
        }

        private void btnMultiple_Click(object sender, EventArgs e)
        {
            N[index] = display.Text;
            index++;
            operation = "+";  // 연산자를 저장
            display.Text = "";  // 디스플레이 초기화
        }

        private void btnDivide_Click(object sender, EventArgs e)
        {
            N[index] = display.Text;
            index++;
            operation = "+";  // 연산자를 저장
            display.Text = "";  // 디스플레이 초기화
        }
        private void btnEqual_Click(object sender, EventArgs e)
        {
            N[index] = display.Text; // 두 번째 숫자를 저장
            for (int i = 0; i < N.Length; i++)
            {
                double Num = double.Parse(N[i]);

                switch (operation)
                {
                    case "+":
                        result += Num;  // 더하기
                        break;
                    case "-":
                        result -= Num;  // 빼기
                        break;
                    case "*":
                        result *= Num;  // 곱하기
                        break;
                    case "/":
                        if (Num != 0)
                            result /= Num;  // 나누기
                        else
                            display.Text = "오류";  // 0을 입력 했을때 오류 표시
                        break;
                }


            }
            display.Text = result.ToString();  // 최종 결과를 디스플레이에 출력
            index = 0;  // 인덱스를 초기화하여 다시 시작할 수 있도록 준비
        }
    }
}
    