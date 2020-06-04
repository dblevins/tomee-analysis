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
public class DefaultFaceletCache$NeverExpiredDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "com/sun/faces/facelets/impl/DefaultFaceletCache$NeverExpired", "Ljava/lang/Object;Lcom/sun/faces/util/ExpiringConcurrentCache$ExpiryChecker<Ljava/net/URL;Lcom/sun/faces/facelets/impl/DefaultFaceletCache$Record;>;", "java/lang/Object", new String[] { "com/sun/faces/util/ExpiringConcurrentCache$ExpiryChecker" });

classWriter.visitInnerClass("com/sun/faces/facelets/impl/DefaultFaceletCache$NeverExpired", "com/sun/faces/facelets/impl/DefaultFaceletCache", "NeverExpired", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/facelets/impl/DefaultFaceletCache$Record", "com/sun/faces/facelets/impl/DefaultFaceletCache", "Record", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/facelets/impl/DefaultFaceletCache$1", null, null, 0);

classWriter.visitInnerClass("com/sun/faces/util/ExpiringConcurrentCache$ExpiryChecker", "com/sun/faces/util/ExpiringConcurrentCache", "ExpiryChecker", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isExpired", "(Ljava/net/URL;Lcom/sun/faces/facelets/impl/DefaultFaceletCache$Record;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "isExpired", "(Ljava/lang/Object;Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/net/URL");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/facelets/impl/DefaultFaceletCache$Record");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/impl/DefaultFaceletCache$NeverExpired", "isExpired", "(Ljava/net/URL;Lcom/sun/faces/facelets/impl/DefaultFaceletCache$Record;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lcom/sun/faces/facelets/impl/DefaultFaceletCache$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/impl/DefaultFaceletCache$NeverExpired", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
