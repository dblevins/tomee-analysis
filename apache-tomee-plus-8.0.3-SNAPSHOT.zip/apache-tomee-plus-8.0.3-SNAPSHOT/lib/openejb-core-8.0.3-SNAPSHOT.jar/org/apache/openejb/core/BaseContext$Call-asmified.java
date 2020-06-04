package asm.org.apache.openejb.core;
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
public class BaseContext$CallDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openejb/core/BaseContext$Call", "Ljava/lang/Enum<Lorg/apache/openejb/core/BaseContext$Call;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/openejb/core/BaseContext$Call", "org/apache/openejb/core/BaseContext", "Call", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "getEJBObject", "Lorg/apache/openejb/core/BaseContext$Call;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "getEJBLocalObject", "Lorg/apache/openejb/core/BaseContext$Call;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "isCallerInRole", "Lorg/apache/openejb/core/BaseContext$Call;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "setRollbackOnly", "Lorg/apache/openejb/core/BaseContext$Call;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "getCallerPrincipal", "Lorg/apache/openejb/core/BaseContext$Call;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "getRollbackOnly", "Lorg/apache/openejb/core/BaseContext$Call;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "getTimerService", "Lorg/apache/openejb/core/BaseContext$Call;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "getUserTransaction", "Lorg/apache/openejb/core/BaseContext$Call;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "getBusinessObject", "Lorg/apache/openejb/core/BaseContext$Call;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "timerMethod", "Lorg/apache/openejb/core/BaseContext$Call;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "getInvokedBusinessInterface", "Lorg/apache/openejb/core/BaseContext$Call;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UserTransactionMethod", "Lorg/apache/openejb/core/BaseContext$Call;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "getMessageContext", "Lorg/apache/openejb/core/BaseContext$Call;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "getPrimaryKey", "Lorg/apache/openejb/core/BaseContext$Call;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "getContextData", "Lorg/apache/openejb/core/BaseContext$Call;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openejb/core/BaseContext$Call;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openejb/core/BaseContext$Call;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/BaseContext$Call", "$VALUES", "[Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openejb/core/BaseContext$Call;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openejb/core/BaseContext$Call;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/core/BaseContext$Call;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/core/BaseContext$Call");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/BaseContext$Call");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("getEJBObject");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/BaseContext$Call", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/BaseContext$Call", "getEJBObject", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/BaseContext$Call");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("getEJBLocalObject");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/BaseContext$Call", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/BaseContext$Call", "getEJBLocalObject", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/BaseContext$Call");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("isCallerInRole");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/BaseContext$Call", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/BaseContext$Call", "isCallerInRole", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/BaseContext$Call");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("setRollbackOnly");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/BaseContext$Call", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/BaseContext$Call", "setRollbackOnly", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/BaseContext$Call");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("getCallerPrincipal");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/BaseContext$Call", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/BaseContext$Call", "getCallerPrincipal", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/BaseContext$Call");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("getRollbackOnly");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/BaseContext$Call", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/BaseContext$Call", "getRollbackOnly", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/BaseContext$Call");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("getTimerService");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/BaseContext$Call", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/BaseContext$Call", "getTimerService", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/BaseContext$Call");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("getUserTransaction");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/BaseContext$Call", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/BaseContext$Call", "getUserTransaction", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/BaseContext$Call");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("getBusinessObject");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/BaseContext$Call", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/BaseContext$Call", "getBusinessObject", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/BaseContext$Call");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("timerMethod");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/BaseContext$Call", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/BaseContext$Call", "timerMethod", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/BaseContext$Call");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("getInvokedBusinessInterface");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/BaseContext$Call", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/BaseContext$Call", "getInvokedBusinessInterface", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/BaseContext$Call");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UserTransactionMethod");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/BaseContext$Call", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/BaseContext$Call", "UserTransactionMethod", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/BaseContext$Call");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("getMessageContext");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/BaseContext$Call", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/BaseContext$Call", "getMessageContext", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/BaseContext$Call");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("getPrimaryKey");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/BaseContext$Call", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/BaseContext$Call", "getPrimaryKey", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/BaseContext$Call");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("getContextData");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/BaseContext$Call", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/BaseContext$Call", "getContextData", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openejb/core/BaseContext$Call");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/BaseContext$Call", "getEJBObject", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/BaseContext$Call", "getEJBLocalObject", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/BaseContext$Call", "isCallerInRole", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/BaseContext$Call", "setRollbackOnly", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/BaseContext$Call", "getCallerPrincipal", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/BaseContext$Call", "getRollbackOnly", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/BaseContext$Call", "getTimerService", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/BaseContext$Call", "getUserTransaction", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/BaseContext$Call", "getBusinessObject", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/BaseContext$Call", "timerMethod", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/BaseContext$Call", "getInvokedBusinessInterface", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/BaseContext$Call", "UserTransactionMethod", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/BaseContext$Call", "getMessageContext", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/BaseContext$Call", "getPrimaryKey", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/BaseContext$Call", "getContextData", "Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/BaseContext$Call", "$VALUES", "[Lorg/apache/openejb/core/BaseContext$Call;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
