package asm.com.sun.faces.facelets.impl;
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
public class DefaultFaceletCache$NoCacheDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "com/sun/faces/facelets/impl/DefaultFaceletCache$NoCache", "Lcom/sun/faces/util/ConcurrentCache<Ljava/net/URL;Lcom/sun/faces/facelets/impl/DefaultFaceletCache$Record;>;", "com/sun/faces/util/ConcurrentCache", null);

classWriter.visitInnerClass("com/sun/faces/util/ConcurrentCache$Factory", "com/sun/faces/util/ConcurrentCache", "Factory", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("com/sun/faces/facelets/impl/DefaultFaceletCache$NoCache", "com/sun/faces/facelets/impl/DefaultFaceletCache", "NoCache", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/facelets/impl/DefaultFaceletCache$Record", "com/sun/faces/facelets/impl/DefaultFaceletCache", "Record", ACC_PRIVATE | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/faces/util/ConcurrentCache$Factory;)V", "(Lcom/sun/faces/util/ConcurrentCache$Factory<Ljava/net/URL;Lcom/sun/faces/facelets/impl/DefaultFaceletCache$Record;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/ConcurrentCache", "<init>", "(Lcom/sun/faces/util/ConcurrentCache$Factory;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Ljava/net/URL;)Lcom/sun/faces/facelets/impl/DefaultFaceletCache$Record;", null, new String[] { "java/util/concurrent/ExecutionException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/impl/DefaultFaceletCache$NoCache", "getFactory", "()Lcom/sun/faces/util/ConcurrentCache$Factory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/faces/util/ConcurrentCache$Factory", "newInstance", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/facelets/impl/DefaultFaceletCache$Record");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/ExecutionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/ExecutionException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "containsKey", "(Ljava/net/URL;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "containsKey", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/net/URL");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/impl/DefaultFaceletCache$NoCache", "containsKey", "(Ljava/net/URL;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "get", "(Ljava/lang/Object;)Ljava/lang/Object;", null, new String[] { "java/util/concurrent/ExecutionException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/net/URL");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/impl/DefaultFaceletCache$NoCache", "get", "(Ljava/net/URL;)Lcom/sun/faces/facelets/impl/DefaultFaceletCache$Record;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
