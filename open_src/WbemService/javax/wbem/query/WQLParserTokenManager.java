/* Generated By:JavaCC: Do not edit this line. WQLParserTokenManager.java */
package javax.wbem.query;

public class WQLParserTokenManager implements WQLParserConstants
{
  public  java.io.PrintStream debugStream = System.out;
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 9:
         jjmatchedKind = 2;
         return jjMoveNfa_0(5, 0);
      case 10:
         jjmatchedKind = 3;
         return jjMoveNfa_0(5, 0);
      case 13:
         jjmatchedKind = 4;
         return jjMoveNfa_0(5, 0);
      case 32:
         jjmatchedKind = 1;
         return jjMoveNfa_0(5, 0);
      case 40:
         jjmatchedKind = 18;
         return jjMoveNfa_0(5, 0);
      case 41:
         jjmatchedKind = 19;
         return jjMoveNfa_0(5, 0);
      case 42:
         jjmatchedKind = 16;
         return jjMoveNfa_0(5, 0);
      case 43:
         jjmatchedKind = 14;
         return jjMoveNfa_0(5, 0);
      case 44:
         jjmatchedKind = 21;
         return jjMoveNfa_0(5, 0);
      case 45:
         jjmatchedKind = 15;
         return jjMoveNfa_0(5, 0);
      case 46:
         jjmatchedKind = 20;
         return jjMoveNfa_0(5, 0);
      case 47:
         jjmatchedKind = 17;
         return jjMoveNfa_0(5, 0);
      case 60:
         jjmatchedKind = 10;
         return jjMoveStringLiteralDfa1_0(0x300L);
      case 61:
         jjmatchedKind = 11;
         return jjMoveNfa_0(5, 0);
      case 62:
         jjmatchedKind = 13;
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 76:
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 78:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 79:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 87:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      default :
         return jjMoveNfa_0(5, 0);
   }
}
private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 0);
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 9;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 1;
         }
         break;
      case 62:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 1;
         }
         break;
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 72:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000L);
      case 73:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000L);
      case 78:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000L);
      case 79:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000L);
      case 82:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 22;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000L);
      case 83:
         return jjMoveStringLiteralDfa2_0(active0, 0x60000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000L);
      case 114:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 22;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x60000000L);
      default :
         break;
   }
   return jjMoveNfa_0(5, 1);
}
private final int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 1);
   }
   switch(curChar)
   {
      case 65:
         if ((active0 & 0x40000000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 2;
         }
         break;
      case 67:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000L);
      case 68:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 23;
            jjmatchedPos = 2;
         }
         break;
      case 69:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000L);
      case 75:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000L);
      case 76:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      case 79:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L);
      case 84:
         if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 2;
         }
         break;
      case 97:
         if ((active0 & 0x40000000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 2;
         }
         break;
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000L);
      case 100:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 23;
            jjmatchedPos = 2;
         }
         break;
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000L);
      case 107:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L);
      case 116:
         if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 2;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(5, 2);
}
private final int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 2);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 2);
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000L);
      case 69:
         if ((active0 & 0x10000000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
      case 77:
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 3;
         }
         break;
      case 82:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000L);
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000L);
      case 101:
         if ((active0 & 0x10000000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
      case 109:
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 3;
         }
         break;
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000L);
      default :
         break;
   }
   return jjMoveNfa_0(5, 3);
}
private final int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 3);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 3);
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000L);
      case 69:
         if ((active0 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 4;
         }
         break;
      case 80:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000000L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000L);
      case 101:
         if ((active0 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 4;
         }
         break;
      case 112:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000000L);
      default :
         break;
   }
   return jjMoveNfa_0(5, 4);
}
private final int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 4);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 4);
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x20000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 5;
         }
         break;
      case 84:
         if ((active0 & 0x2000000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 5;
         }
         break;
      case 101:
         if ((active0 & 0x20000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 5;
         }
         break;
      case 116:
         if ((active0 & 0x2000000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 5;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(5, 5);
}
private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
private final void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}
private final void jjCheckNAddStates(int start)
{
   jjCheckNAdd(jjnextStates[start]);
   jjCheckNAdd(jjnextStates[start + 1]);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec1 = {
   0x0L, 0x0L, 0x0L, 0xff7fffffff7fffffL
};
private final int jjMoveNfa_0(int startState, int curPos)
{
   int strKind = jjmatchedKind;
   int strPos = jjmatchedPos;
   int seenUpto;
   input_stream.backup(seenUpto = curPos + 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { throw new Error("Internal Error"); }
   curPos = 0;
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 46;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 33)
                        kind = 33;
                     jjCheckNAddStates(0, 4);
                  }
                  else if (curChar == 36)
                  {
                     if (kind > 35)
                        kind = 35;
                     jjCheckNAddTwoStates(44, 45);
                  }
                  else if (curChar == 47)
                     jjAddStates(5, 7);
                  else if (curChar == 39)
                     jjCheckNAddStates(8, 10);
                  else if (curChar == 46)
                     jjCheckNAdd(7);
                  else if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 0:
                  if (curChar == 45)
                     jjCheckNAddStates(11, 13);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(11, 13);
                  break;
               case 2:
                  if ((0x2400L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 3:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 4:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 6:
                  if (curChar == 46)
                     jjCheckNAdd(7);
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAddTwoStates(7, 8);
                  break;
               case 9:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(10);
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAdd(10);
                  break;
               case 11:
               case 13:
                  if (curChar == 39)
                     jjCheckNAddStates(8, 10);
                  break;
               case 12:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjCheckNAddStates(8, 10);
                  break;
               case 14:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if (curChar == 39 && kind > 34)
                     kind = 34;
                  break;
               case 16:
                  if (curChar == 47)
                     jjAddStates(5, 7);
                  break;
               case 17:
                  if (curChar == 47)
                     jjCheckNAddStates(11, 13);
                  break;
               case 18:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(19, 20);
                  break;
               case 19:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(19, 20);
                  break;
               case 20:
                  if (curChar == 42)
                     jjCheckNAddStates(14, 16);
                  break;
               case 21:
                  if ((0xffff7bffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(22, 20);
                  break;
               case 22:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(22, 20);
                  break;
               case 23:
                  if (curChar == 47 && kind > 6)
                     kind = 6;
                  break;
               case 24:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 25:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(26, 27);
                  break;
               case 26:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(26, 27);
                  break;
               case 27:
                  if (curChar == 42)
                     jjCheckNAddStates(17, 19);
                  break;
               case 28:
                  if ((0xffff7bffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(29, 27);
                  break;
               case 29:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(29, 27);
                  break;
               case 30:
                  if (curChar == 47 && kind > 7)
                     kind = 7;
                  break;
               case 31:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjCheckNAddStates(0, 4);
                  break;
               case 32:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(32, 33);
                  break;
               case 33:
                  if (curChar != 46)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAddTwoStates(34, 35);
                  break;
               case 34:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAddTwoStates(34, 35);
                  break;
               case 36:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(37);
                  break;
               case 37:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAdd(37);
                  break;
               case 38:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(38, 39);
                  break;
               case 40:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(41);
                  break;
               case 41:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAdd(41);
                  break;
               case 42:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjCheckNAdd(42);
                  break;
               case 43:
                  if (curChar != 36)
                     break;
                  if (kind > 35)
                     kind = 35;
                  jjCheckNAddTwoStates(44, 45);
                  break;
               case 44:
                  if ((0x3ff001000000000L & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  jjCheckNAdd(44);
                  break;
               case 45:
                  if ((0x3ff401000000000L & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAdd(45);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  jjCheckNAddTwoStates(44, 45);
                  break;
               case 1:
                  jjAddStates(11, 13);
                  break;
               case 8:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(20, 21);
                  break;
               case 12:
                  jjAddStates(8, 10);
                  break;
               case 19:
                  jjCheckNAddTwoStates(19, 20);
                  break;
               case 21:
               case 22:
                  jjCheckNAddTwoStates(22, 20);
                  break;
               case 26:
                  jjCheckNAddTwoStates(26, 27);
                  break;
               case 28:
               case 29:
                  jjCheckNAddTwoStates(29, 27);
                  break;
               case 35:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(22, 23);
                  break;
               case 39:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(24, 25);
                  break;
               case 44:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  jjCheckNAdd(44);
                  break;
               case 45:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAdd(45);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((jjbitVec1[i2] & l2) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  jjCheckNAddTwoStates(44, 45);
                  break;
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(11, 13);
                  break;
               case 12:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(8, 10);
                  break;
               case 19:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(19, 20);
                  break;
               case 21:
               case 22:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(22, 20);
                  break;
               case 26:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(26, 27);
                  break;
               case 28:
               case 29:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(29, 27);
                  break;
               case 44:
                  if ((jjbitVec1[i2] & l2) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  jjCheckNAdd(44);
                  break;
               case 45:
                  if ((jjbitVec1[i2] & l2) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAdd(45);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 46 - (jjnewStateCnt = startsAt)))
         break;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { break; }
   }
   if (jjmatchedPos > strPos)
      return curPos;

   int toRet = Math.max(curPos, seenUpto);

   if (curPos < toRet)
      for (i = toRet - Math.min(curPos, seenUpto); i-- > 0; )
         try { curChar = input_stream.readChar(); }
         catch(java.io.IOException e) { throw new Error("Internal Error : Please send a bug report."); }

   if (jjmatchedPos < strPos)
   {
      jjmatchedKind = strKind;
      jjmatchedPos = strPos;
   }
   else if (jjmatchedPos == strPos && jjmatchedKind > strKind)
      jjmatchedKind = strKind;

   return toRet;
}
static final int[] jjnextStates = {
   32, 33, 38, 39, 42, 17, 24, 25, 12, 14, 15, 1, 2, 4, 20, 21, 
   23, 27, 28, 30, 9, 10, 36, 37, 40, 41, 
};
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, "\74\76", "\74\75", "\74", 
"\75", "\76\75", "\76", "\53", "\55", "\52", "\57", "\50", "\51", "\56", "\54", null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, };
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0x1effffff01L, 
};
static final long[] jjtoSkip = {
   0xfeL, 
};
static final long[] jjtoSpecial = {
   0xe0L, 
};
private SimpleCharStream input_stream;
private final int[] jjrounds = new int[46];
private final int[] jjstateSet = new int[92];
protected char curChar;
public WQLParserTokenManager(SimpleCharStream stream)
{
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}
public WQLParserTokenManager(SimpleCharStream stream, int lexState)
{
   this(stream);
   SwitchTo(lexState);
}
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 46; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

private final Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

public final Token getNextToken() 
{
  int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         matchedToken.specialToken = specialToken;
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
         }
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

}
