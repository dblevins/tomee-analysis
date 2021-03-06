package asm.org.apache.cxf.common.classloader;
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
public class ClassLoaderUtils$ClassLoaderHolder$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder$1", "Ljava/lang/Object;Ljava/security/PrivilegedAction<Ljava/lang/Void;>;", "java/lang/Object", new String[] { "java/security/PrivilegedAction" });

classWriter.visitOuterClass("org/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder", "reset", "()V");

classWriter.visitInnerClass("org/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder", "org/apache/cxf/common/classloader/ClassLoaderUtils", "ClassLoaderHolder", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder$1", "this$0", "Lorg/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()Ljava/lang/Void;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder$1", "this$0", "Lorg/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder", "thread", "Ljava/lang/Thread;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder$1", "this$0", "Lorg/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder", "loader", "Ljava/lang/ClassLoader;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "setContextClassLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "run", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder$1", "run", "()Ljava/lang/Void;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
