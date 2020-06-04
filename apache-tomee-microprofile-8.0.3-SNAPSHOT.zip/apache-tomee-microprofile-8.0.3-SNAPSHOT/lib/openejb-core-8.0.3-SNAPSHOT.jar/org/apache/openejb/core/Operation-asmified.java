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
public class OperationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openejb/core/Operation", "Ljava/lang/Enum<Lorg/apache/openejb/core/Operation;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INJECTION", "Lorg/apache/openejb/core/Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "POST_CONSTRUCT", "Lorg/apache/openejb/core/Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BUSINESS", "Lorg/apache/openejb/core/Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BUSINESS_WS", "Lorg/apache/openejb/core/Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TIMEOUT", "Lorg/apache/openejb/core/Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AFTER_BEGIN", "Lorg/apache/openejb/core/Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AFTER_COMPLETION", "Lorg/apache/openejb/core/Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BEFORE_COMPLETION", "Lorg/apache/openejb/core/Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PRE_DESTROY", "Lorg/apache/openejb/core/Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REMOVE", "Lorg/apache/openejb/core/Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SET_CONTEXT", "Lorg/apache/openejb/core/Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNSET_CONTEXT", "Lorg/apache/openejb/core/Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CREATE", "Lorg/apache/openejb/core/Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "POST_CREATE", "Lorg/apache/openejb/core/Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ACTIVATE", "Lorg/apache/openejb/core/Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PASSIVATE", "Lorg/apache/openejb/core/Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FIND", "Lorg/apache/openejb/core/Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HOME", "Lorg/apache/openejb/core/Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LOAD", "Lorg/apache/openejb/core/Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STORE", "Lorg/apache/openejb/core/Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "callback", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openejb/core/Operation;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openejb/core/Operation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/Operation", "$VALUES", "[Lorg/apache/openejb/core/Operation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openejb/core/Operation;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openejb/core/Operation;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openejb/core/Operation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/core/Operation;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/core/Operation");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;IZ)V", "(Z)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/Operation", "callback", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isCallback", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/Operation", "callback", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INJECTION");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/Operation", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/Operation", "INJECTION", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("POST_CONSTRUCT");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/Operation", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/Operation", "POST_CONSTRUCT", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BUSINESS");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/Operation", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/Operation", "BUSINESS", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BUSINESS_WS");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/Operation", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/Operation", "BUSINESS_WS", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TIMEOUT");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/Operation", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/Operation", "TIMEOUT", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AFTER_BEGIN");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/Operation", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/Operation", "AFTER_BEGIN", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AFTER_COMPLETION");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/Operation", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/Operation", "AFTER_COMPLETION", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BEFORE_COMPLETION");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/Operation", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/Operation", "BEFORE_COMPLETION", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PRE_DESTROY");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/Operation", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/Operation", "PRE_DESTROY", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REMOVE");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/Operation", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/Operation", "REMOVE", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SET_CONTEXT");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/Operation", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/Operation", "SET_CONTEXT", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNSET_CONTEXT");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/Operation", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/Operation", "UNSET_CONTEXT", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CREATE");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/Operation", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/Operation", "CREATE", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("POST_CREATE");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/Operation", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/Operation", "POST_CREATE", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ACTIVATE");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/Operation", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/Operation", "ACTIVATE", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PASSIVATE");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/Operation", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/Operation", "PASSIVATE", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FIND");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/Operation", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/Operation", "FIND", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HOME");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/Operation", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/Operation", "HOME", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LOAD");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/Operation", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/Operation", "LOAD", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STORE");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/Operation", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/Operation", "STORE", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openejb/core/Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/Operation", "INJECTION", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/Operation", "POST_CONSTRUCT", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/Operation", "BUSINESS", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/Operation", "BUSINESS_WS", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/Operation", "TIMEOUT", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/Operation", "AFTER_BEGIN", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/Operation", "AFTER_COMPLETION", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/Operation", "BEFORE_COMPLETION", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/Operation", "PRE_DESTROY", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/Operation", "REMOVE", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/Operation", "SET_CONTEXT", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/Operation", "UNSET_CONTEXT", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/Operation", "CREATE", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/Operation", "POST_CREATE", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/Operation", "ACTIVATE", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/Operation", "PASSIVATE", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/Operation", "FIND", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/Operation", "HOME", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/Operation", "LOAD", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/Operation", "STORE", "Lorg/apache/openejb/core/Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/Operation", "$VALUES", "[Lorg/apache/openejb/core/Operation;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
