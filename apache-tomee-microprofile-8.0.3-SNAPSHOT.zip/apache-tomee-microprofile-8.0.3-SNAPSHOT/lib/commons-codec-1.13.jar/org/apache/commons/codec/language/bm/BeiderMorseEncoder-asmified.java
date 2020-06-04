package asm.org.apache.commons.codec.language.bm;
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
public class BeiderMorseEncoderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/codec/language/bm/BeiderMorseEncoder", null, "java/lang/Object", new String[] { "org/apache/commons/codec/StringEncoder" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "engine", "Lorg/apache/commons/codec/language/bm/PhoneticEngine;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/codec/language/bm/PhoneticEngine");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/codec/language/bm/NameType", "GENERIC", "Lorg/apache/commons/codec/language/bm/NameType;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/codec/language/bm/RuleType", "APPROX", "Lorg/apache/commons/codec/language/bm/RuleType;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/codec/language/bm/PhoneticEngine", "<init>", "(Lorg/apache/commons/codec/language/bm/NameType;Lorg/apache/commons/codec/language/bm/RuleType;Z)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/codec/language/bm/BeiderMorseEncoder", "engine", "Lorg/apache/commons/codec/language/bm/PhoneticEngine;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encode", "(Ljava/lang/Object;)Ljava/lang/Object;", null, new String[] { "org/apache/commons/codec/EncoderException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/String");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/codec/EncoderException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BeiderMorseEncoder encode parameter is not of type String");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/codec/EncoderException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/codec/language/bm/BeiderMorseEncoder", "encode", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encode", "(Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "org/apache/commons/codec/EncoderException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/language/bm/BeiderMorseEncoder", "engine", "Lorg/apache/commons/codec/language/bm/PhoneticEngine;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/codec/language/bm/PhoneticEngine", "encode", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNameType", "()Lorg/apache/commons/codec/language/bm/NameType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/language/bm/BeiderMorseEncoder", "engine", "Lorg/apache/commons/codec/language/bm/PhoneticEngine;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/codec/language/bm/PhoneticEngine", "getNameType", "()Lorg/apache/commons/codec/language/bm/NameType;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRuleType", "()Lorg/apache/commons/codec/language/bm/RuleType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/language/bm/BeiderMorseEncoder", "engine", "Lorg/apache/commons/codec/language/bm/PhoneticEngine;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/codec/language/bm/PhoneticEngine", "getRuleType", "()Lorg/apache/commons/codec/language/bm/RuleType;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isConcat", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/language/bm/BeiderMorseEncoder", "engine", "Lorg/apache/commons/codec/language/bm/PhoneticEngine;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/codec/language/bm/PhoneticEngine", "isConcat", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConcat", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/codec/language/bm/PhoneticEngine");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/language/bm/BeiderMorseEncoder", "engine", "Lorg/apache/commons/codec/language/bm/PhoneticEngine;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/codec/language/bm/PhoneticEngine", "getNameType", "()Lorg/apache/commons/codec/language/bm/NameType;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/language/bm/BeiderMorseEncoder", "engine", "Lorg/apache/commons/codec/language/bm/PhoneticEngine;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/codec/language/bm/PhoneticEngine", "getRuleType", "()Lorg/apache/commons/codec/language/bm/RuleType;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/language/bm/BeiderMorseEncoder", "engine", "Lorg/apache/commons/codec/language/bm/PhoneticEngine;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/codec/language/bm/PhoneticEngine", "getMaxPhonemes", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/codec/language/bm/PhoneticEngine", "<init>", "(Lorg/apache/commons/codec/language/bm/NameType;Lorg/apache/commons/codec/language/bm/RuleType;ZI)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/codec/language/bm/BeiderMorseEncoder", "engine", "Lorg/apache/commons/codec/language/bm/PhoneticEngine;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNameType", "(Lorg/apache/commons/codec/language/bm/NameType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/codec/language/bm/PhoneticEngine");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/language/bm/BeiderMorseEncoder", "engine", "Lorg/apache/commons/codec/language/bm/PhoneticEngine;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/codec/language/bm/PhoneticEngine", "getRuleType", "()Lorg/apache/commons/codec/language/bm/RuleType;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/language/bm/BeiderMorseEncoder", "engine", "Lorg/apache/commons/codec/language/bm/PhoneticEngine;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/codec/language/bm/PhoneticEngine", "isConcat", "()Z", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/language/bm/BeiderMorseEncoder", "engine", "Lorg/apache/commons/codec/language/bm/PhoneticEngine;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/codec/language/bm/PhoneticEngine", "getMaxPhonemes", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/codec/language/bm/PhoneticEngine", "<init>", "(Lorg/apache/commons/codec/language/bm/NameType;Lorg/apache/commons/codec/language/bm/RuleType;ZI)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/codec/language/bm/BeiderMorseEncoder", "engine", "Lorg/apache/commons/codec/language/bm/PhoneticEngine;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRuleType", "(Lorg/apache/commons/codec/language/bm/RuleType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/codec/language/bm/PhoneticEngine");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/language/bm/BeiderMorseEncoder", "engine", "Lorg/apache/commons/codec/language/bm/PhoneticEngine;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/codec/language/bm/PhoneticEngine", "getNameType", "()Lorg/apache/commons/codec/language/bm/NameType;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/language/bm/BeiderMorseEncoder", "engine", "Lorg/apache/commons/codec/language/bm/PhoneticEngine;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/codec/language/bm/PhoneticEngine", "isConcat", "()Z", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/language/bm/BeiderMorseEncoder", "engine", "Lorg/apache/commons/codec/language/bm/PhoneticEngine;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/codec/language/bm/PhoneticEngine", "getMaxPhonemes", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/codec/language/bm/PhoneticEngine", "<init>", "(Lorg/apache/commons/codec/language/bm/NameType;Lorg/apache/commons/codec/language/bm/RuleType;ZI)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/codec/language/bm/BeiderMorseEncoder", "engine", "Lorg/apache/commons/codec/language/bm/PhoneticEngine;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxPhonemes", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/codec/language/bm/PhoneticEngine");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/language/bm/BeiderMorseEncoder", "engine", "Lorg/apache/commons/codec/language/bm/PhoneticEngine;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/codec/language/bm/PhoneticEngine", "getNameType", "()Lorg/apache/commons/codec/language/bm/NameType;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/language/bm/BeiderMorseEncoder", "engine", "Lorg/apache/commons/codec/language/bm/PhoneticEngine;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/codec/language/bm/PhoneticEngine", "getRuleType", "()Lorg/apache/commons/codec/language/bm/RuleType;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/language/bm/BeiderMorseEncoder", "engine", "Lorg/apache/commons/codec/language/bm/PhoneticEngine;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/codec/language/bm/PhoneticEngine", "isConcat", "()Z", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/codec/language/bm/PhoneticEngine", "<init>", "(Lorg/apache/commons/codec/language/bm/NameType;Lorg/apache/commons/codec/language/bm/RuleType;ZI)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/codec/language/bm/BeiderMorseEncoder", "engine", "Lorg/apache/commons/codec/language/bm/PhoneticEngine;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
