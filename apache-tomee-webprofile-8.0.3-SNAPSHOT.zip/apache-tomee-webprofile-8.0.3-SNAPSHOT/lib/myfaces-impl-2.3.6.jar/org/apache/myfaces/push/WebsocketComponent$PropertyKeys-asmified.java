package asm.org.apache.myfaces.push;
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
public class WebsocketComponent$PropertyKeysDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "Ljava/lang/Enum<Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "org/apache/myfaces/push/WebsocketComponent", "PropertyKeys", ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "channel", "Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "scope", "Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "user", "Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onopen", "Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmessage", "Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onclose", "Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "connected", "Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "initComponentId", "Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "$VALUES", "[Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys");
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
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("channel");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "channel", "Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("scope");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "scope", "Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("user");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "user", "Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onopen");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "onopen", "Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmessage");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "onmessage", "Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onclose");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "onclose", "Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("connected");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "connected", "Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("initComponentId");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "initComponentId", "Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "channel", "Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "scope", "Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "user", "Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "onopen", "Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "onmessage", "Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "onclose", "Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "connected", "Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "initComponentId", "Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/push/WebsocketComponent$PropertyKeys", "$VALUES", "[Lorg/apache/myfaces/push/WebsocketComponent$PropertyKeys;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
