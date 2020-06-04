package asm.org.apache.wss4j.policy.model;
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
public class AlgorithmSuite$C14NTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType", "Ljava/lang/Enum<Lorg/apache/wss4j/policy/model/AlgorithmSuite$C14NType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/wss4j/policy/model/AlgorithmSuite$C14NType", "org/apache/wss4j/policy/model/AlgorithmSuite", "C14NType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ExclusiveC14N", "Lorg/apache/wss4j/policy/model/AlgorithmSuite$C14NType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "InclusiveC14N", "Lorg/apache/wss4j/policy/model/AlgorithmSuite$C14NType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "InclusiveC14N11", "Lorg/apache/wss4j/policy/model/AlgorithmSuite$C14NType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOOKUP", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Lorg/apache/wss4j/policy/model/AlgorithmSuite$C14NType;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "value", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/wss4j/policy/model/AlgorithmSuite$C14NType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/wss4j/policy/model/AlgorithmSuite$C14NType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType", "$VALUES", "[Lorg/apache/wss4j/policy/model/AlgorithmSuite$C14NType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/wss4j/policy/model/AlgorithmSuite$C14NType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/wss4j/policy/model/AlgorithmSuite$C14NType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/wss4j/policy/model/AlgorithmSuite$C14NType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/wss4j/policy/model/AlgorithmSuite$C14NType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "lookUp", "(Ljava/lang/String;)Lorg/apache/wss4j/policy/model/AlgorithmSuite$C14NType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType", "LOOKUP", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValue", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType", "value", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "(Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType", "value", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ExclusiveC14N");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/10/xml-exc-c14n#");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType", "ExclusiveC14N", "Lorg/apache/wss4j/policy/model/AlgorithmSuite$C14NType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("InclusiveC14N");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType", "InclusiveC14N", "Lorg/apache/wss4j/policy/model/AlgorithmSuite$C14NType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("InclusiveC14N11");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("http://www.w3.org/2006/12/xml-c14n11");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType", "InclusiveC14N11", "Lorg/apache/wss4j/policy/model/AlgorithmSuite$C14NType;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType", "ExclusiveC14N", "Lorg/apache/wss4j/policy/model/AlgorithmSuite$C14NType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType", "InclusiveC14N", "Lorg/apache/wss4j/policy/model/AlgorithmSuite$C14NType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType", "InclusiveC14N11", "Lorg/apache/wss4j/policy/model/AlgorithmSuite$C14NType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType", "$VALUES", "[Lorg/apache/wss4j/policy/model/AlgorithmSuite$C14NType;");
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType", "LOOKUP", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/wss4j/policy/model/AlgorithmSuite$C14NType;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/EnumSet", "allOf", "(Ljava/lang/Class;)Ljava/util/EnumSet;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/EnumSet", "iterator", "()Ljava/util/Iterator;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType", "LOOKUP", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/AlgorithmSuite$C14NType", "name", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
