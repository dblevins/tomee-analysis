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
public class SamlToken$SamlTokenTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType", "Ljava/lang/Enum<Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/wss4j/policy/model/SamlToken$SamlTokenType", "org/apache/wss4j/policy/model/SamlToken", "SamlTokenType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WssSamlV10Token10", "Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WssSamlV11Token10", "Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WssSamlV10Token11", "Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WssSamlV11Token11", "Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WssSamlV20Token11", "Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOOKUP", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType", "$VALUES", "[Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "lookUp", "(Ljava/lang/String;)Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType", "LOOKUP", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WssSamlV10Token10");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType", "WssSamlV10Token10", "Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WssSamlV11Token10");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType", "WssSamlV11Token10", "Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WssSamlV10Token11");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType", "WssSamlV10Token11", "Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WssSamlV11Token11");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType", "WssSamlV11Token11", "Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WssSamlV20Token11");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType", "WssSamlV20Token11", "Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType", "WssSamlV10Token10", "Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType", "WssSamlV11Token10", "Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType", "WssSamlV10Token11", "Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType", "WssSamlV11Token11", "Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType", "WssSamlV20Token11", "Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType", "$VALUES", "[Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;");
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType", "LOOKUP", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/wss4j/policy/model/SamlToken$SamlTokenType;"));
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
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType", "LOOKUP", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/SamlToken$SamlTokenType", "name", "()Ljava/lang/String;", false);
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
