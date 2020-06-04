package asm.com.sun.faces.util;
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
public class ExpiringConcurrentCache$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "com/sun/faces/util/ExpiringConcurrentCache$1", "Ljava/lang/Object;Ljava/util/concurrent/Callable<TV;>;", "java/lang/Object", new String[] { "java/util/concurrent/Callable" });

classWriter.visitOuterClass("com/sun/faces/util/ExpiringConcurrentCache", "get", "(Ljava/lang/Object;)Ljava/lang/Object;");

classWriter.visitInnerClass("com/sun/faces/util/ExpiringConcurrentCache$1", null, null, 0);

classWriter.visitInnerClass("com/sun/faces/util/ConcurrentCache$Factory", "com/sun/faces/util/ConcurrentCache", "Factory", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$key", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/faces/util/ExpiringConcurrentCache;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/faces/util/ExpiringConcurrentCache;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/util/ExpiringConcurrentCache$1", "this$0", "Lcom/sun/faces/util/ExpiringConcurrentCache;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/util/ExpiringConcurrentCache$1", "val$key", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "call", "()Ljava/lang/Object;", "()TV;", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/util/ExpiringConcurrentCache$1", "this$0", "Lcom/sun/faces/util/ExpiringConcurrentCache;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/util/ExpiringConcurrentCache", "getFactory", "()Lcom/sun/faces/util/ConcurrentCache$Factory;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/util/ExpiringConcurrentCache$1", "val$key", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/faces/util/ConcurrentCache$Factory", "newInstance", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
