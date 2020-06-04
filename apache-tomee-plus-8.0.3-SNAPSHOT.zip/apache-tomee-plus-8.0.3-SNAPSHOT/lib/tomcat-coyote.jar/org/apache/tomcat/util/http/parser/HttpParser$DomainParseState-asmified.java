package asm.org.apache.tomcat.util.http.parser;
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
public class HttpParser$DomainParseStateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "Ljava/lang/Enum<Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "org/apache/tomcat/util/http/parser/HttpParser", "DomainParseState", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NEW", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALPHA", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NUMERIC", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PERIOD", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HYPHEN", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COLON", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "END", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "mayContinue", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "allowsHyphen", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "allowsPeriod", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "allowsEnd", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "errorMsg", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "$VALUES", "[Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;IZZZZLjava/lang/String;)V", "(ZZZZLjava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "mayContinue", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "allowsHyphen", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "allowsPeriod", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "allowsEnd", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "errorMsg", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "mayContinue", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "mayContinue", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "(I)Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "allowsEnd", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "END", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/parser/HttpParser", "access$000", "()Lorg/apache/tomcat/util/res/StringManager;", false);
methodVisitor.visitLdcInsn("http.invalidSegmentEndState");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "name", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/parser/HttpParser", "isAlpha", "(I)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "ALPHA", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/parser/HttpParser", "isNumeric", "(I)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "NUMERIC", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 46);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "allowsPeriod", "Z");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "PERIOD", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/parser/HttpParser", "access$000", "()Lorg/apache/tomcat/util/res/StringManager;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "errorMsg", "Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(I2C);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "toString", "(C)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 58);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "allowsEnd", "Z");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "COLON", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/parser/HttpParser", "access$000", "()Lorg/apache/tomcat/util/res/StringManager;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "errorMsg", "Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(I2C);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "toString", "(C)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 45);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "allowsHyphen", "Z");
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "HYPHEN", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/parser/HttpParser", "access$000", "()Lorg/apache/tomcat/util/res/StringManager;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "errorMsg", "Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(I2C);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "toString", "(C)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/http/parser/HttpParser", "access$000", "()Lorg/apache/tomcat/util/res/StringManager;", false);
methodVisitor.visitLdcInsn("http.illegalCharacterDomain");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(I2C);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "toString", "(C)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(8, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NEW");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("http.invalidCharacterDomain.atStart");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "<init>", "(Ljava/lang/String;IZZZZLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "NEW", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALPHA");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("http.invalidCharacterDomain.afterLetter");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "<init>", "(Ljava/lang/String;IZZZZLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "ALPHA", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NUMERIC");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("http.invalidCharacterDomain.afterNumber");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "<init>", "(Ljava/lang/String;IZZZZLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "NUMERIC", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PERIOD");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("http.invalidCharacterDomain.afterPeriod");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "<init>", "(Ljava/lang/String;IZZZZLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "PERIOD", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HYPHEN");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("http.invalidCharacterDomain.afterHyphen");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "<init>", "(Ljava/lang/String;IZZZZLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "HYPHEN", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COLON");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("http.invalidCharacterDomain.afterColon");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "<init>", "(Ljava/lang/String;IZZZZLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "COLON", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("END");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("http.invalidCharacterDomain.atEnd");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "<init>", "(Ljava/lang/String;IZZZZLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "END", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "NEW", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "ALPHA", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "NUMERIC", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "PERIOD", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "HYPHEN", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "COLON", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "END", "Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/parser/HttpParser$DomainParseState", "$VALUES", "[Lorg/apache/tomcat/util/http/parser/HttpParser$DomainParseState;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
