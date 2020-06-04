package asm.org.apache.openejb.core.ivm;
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
public class EjbHomeProxyHandler$MethodTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType", "Ljava/lang/Enum<Lorg/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType", "org/apache/openejb/core/ivm/EjbHomeProxyHandler", "MethodType", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CREATE", "Lorg/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FIND", "Lorg/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HOME_HANDLE", "Lorg/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "META_DATA", "Lorg/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REMOVE", "Lorg/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType", "$VALUES", "[Lorg/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CREATE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType", "CREATE", "Lorg/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FIND");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType", "FIND", "Lorg/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HOME_HANDLE");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType", "HOME_HANDLE", "Lorg/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("META_DATA");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType", "META_DATA", "Lorg/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REMOVE");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType", "REMOVE", "Lorg/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType", "CREATE", "Lorg/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType", "FIND", "Lorg/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType", "HOME_HANDLE", "Lorg/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType", "META_DATA", "Lorg/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType", "REMOVE", "Lorg/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType", "$VALUES", "[Lorg/apache/openejb/core/ivm/EjbHomeProxyHandler$MethodType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
