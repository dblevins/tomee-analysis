package asm.org.apache.wss4j.policy;
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
public class SPConstants$IncludeTokenTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/wss4j/policy/SPConstants$IncludeTokenType", "Ljava/lang/Enum<Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/wss4j/policy/SPConstants$IncludeTokenType", "org/apache/wss4j/policy/SPConstants", "IncludeTokenType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INCLUDE_TOKEN_NEVER", "Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INCLUDE_TOKEN_ONCE", "Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INCLUDE_TOKEN_ALWAYS_TO_RECIPIENT", "Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INCLUDE_TOKEN_ALWAYS_TO_INITIATOR", "Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INCLUDE_TOKEN_ALWAYS", "Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOOKUP", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SPConstants$IncludeTokenType", "$VALUES", "[Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/policy/SPConstants$IncludeTokenType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "lookUp", "(Ljava/lang/String;)Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SPConstants$IncludeTokenType", "LOOKUP", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/policy/SPConstants$IncludeTokenType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/policy/SPConstants$IncludeTokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INCLUDE_TOKEN_NEVER");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/SPConstants$IncludeTokenType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/policy/SPConstants$IncludeTokenType", "INCLUDE_TOKEN_NEVER", "Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/policy/SPConstants$IncludeTokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INCLUDE_TOKEN_ONCE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/SPConstants$IncludeTokenType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/policy/SPConstants$IncludeTokenType", "INCLUDE_TOKEN_ONCE", "Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/policy/SPConstants$IncludeTokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INCLUDE_TOKEN_ALWAYS_TO_RECIPIENT");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/SPConstants$IncludeTokenType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/policy/SPConstants$IncludeTokenType", "INCLUDE_TOKEN_ALWAYS_TO_RECIPIENT", "Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/policy/SPConstants$IncludeTokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INCLUDE_TOKEN_ALWAYS_TO_INITIATOR");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/SPConstants$IncludeTokenType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/policy/SPConstants$IncludeTokenType", "INCLUDE_TOKEN_ALWAYS_TO_INITIATOR", "Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/policy/SPConstants$IncludeTokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INCLUDE_TOKEN_ALWAYS");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/SPConstants$IncludeTokenType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/policy/SPConstants$IncludeTokenType", "INCLUDE_TOKEN_ALWAYS", "Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/wss4j/policy/SPConstants$IncludeTokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SPConstants$IncludeTokenType", "INCLUDE_TOKEN_NEVER", "Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SPConstants$IncludeTokenType", "INCLUDE_TOKEN_ONCE", "Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SPConstants$IncludeTokenType", "INCLUDE_TOKEN_ALWAYS_TO_RECIPIENT", "Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SPConstants$IncludeTokenType", "INCLUDE_TOKEN_ALWAYS_TO_INITIATOR", "Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SPConstants$IncludeTokenType", "INCLUDE_TOKEN_ALWAYS", "Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/policy/SPConstants$IncludeTokenType", "$VALUES", "[Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;");
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/policy/SPConstants$IncludeTokenType", "LOOKUP", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/wss4j/policy/SPConstants$IncludeTokenType;"));
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
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/policy/SPConstants$IncludeTokenType");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SPConstants$IncludeTokenType", "LOOKUP", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/SPConstants$IncludeTokenType", "name", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
