package asm.org.eclipse.persistence.internal.jpa.parsing.jpql.antlr;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class JPQLLexer$DFA17Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer$DFA17", null, "org/eclipse/persistence/internal/libraries/antlr/runtime/DFA", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer$DFA17", "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer", "DFA17", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/BaseRecognizer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer$DFA17", "this$0", "Lorg/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/DFA", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer$DFA17", "recognizer", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/BaseRecognizer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer$DFA17", "decisionNumber", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer", "DFA17_eot", "[S");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer$DFA17", "eot", "[S");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer", "DFA17_eof", "[S");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer$DFA17", "eof", "[S");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer", "DFA17_min", "[C");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer$DFA17", "min", "[C");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer", "DFA17_max", "[C");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer$DFA17", "max", "[C");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer", "DFA17_accept", "[S");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer$DFA17", "accept", "[S");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer", "DFA17_special", "[S");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer$DFA17", "special", "[S");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer", "DFA17_transition", "[[S");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer$DFA17", "transition", "[[S");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDescription", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("1481:1: fragment NUMERIC_DIGITS : ( ( MINUS )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* | ( MINUS )? '.' ( '0' .. '9' )+ | ( MINUS )? ( '0' .. '9' )+ );");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
