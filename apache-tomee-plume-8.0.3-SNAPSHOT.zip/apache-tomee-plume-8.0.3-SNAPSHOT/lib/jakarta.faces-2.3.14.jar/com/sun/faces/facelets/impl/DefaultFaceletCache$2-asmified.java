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
public class DefaultFaceletCache$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "com/sun/faces/facelets/impl/DefaultFaceletCache$2", "Ljava/lang/Object;Lcom/sun/faces/util/ConcurrentCache$Factory<Ljava/net/URL;Lcom/sun/faces/facelets/impl/DefaultFaceletCache$Record;>;", "java/lang/Object", new String[] { "com/sun/faces/util/ConcurrentCache$Factory" });

classWriter.visitOuterClass("com/sun/faces/facelets/impl/DefaultFaceletCache", "<init>", "(J)V");

classWriter.visitInnerClass("com/sun/faces/facelets/impl/DefaultFaceletCache$2", null, null, 0);

classWriter.visitInnerClass("com/sun/faces/facelets/impl/DefaultFaceletCache$Record", "com/sun/faces/facelets/impl/DefaultFaceletCache", "Record", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/util/ConcurrentCache$Factory", "com/sun/faces/util/ConcurrentCache", "Factory", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("javax/faces/view/facelets/FaceletCache$MemberFactory", "javax/faces/view/facelets/FaceletCache", "MemberFactory", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$checkExpiry", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$refreshPeriod", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/faces/facelets/impl/DefaultFaceletCache;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/faces/facelets/impl/DefaultFaceletCache;ZJ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/impl/DefaultFaceletCache$2", "this$0", "Lcom/sun/faces/facelets/impl/DefaultFaceletCache;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/impl/DefaultFaceletCache$2", "val$checkExpiry", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/impl/DefaultFaceletCache$2", "val$refreshPeriod", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newInstance", "(Ljava/net/URL;)Lcom/sun/faces/facelets/impl/DefaultFaceletCache$Record;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/impl/DefaultFaceletCache$2", "val$checkExpiry", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/Util", "getLastModified", "(Ljava/net/URL;)J", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.LONG});
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/impl/DefaultFaceletCache$Record");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/impl/DefaultFaceletCache$2", "this$0", "Lcom/sun/faces/facelets/impl/DefaultFaceletCache;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/impl/DefaultFaceletCache", "access$100", "(Lcom/sun/faces/facelets/impl/DefaultFaceletCache;)Ljavax/faces/view/facelets/FaceletCache$MemberFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/view/facelets/FaceletCache$MemberFactory", "newInstance", "(Ljava/net/URL;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/facelets/impl/DefaultFacelet");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/impl/DefaultFaceletCache$2", "val$refreshPeriod", "J");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/impl/DefaultFaceletCache$Record", "<init>", "(JJLcom/sun/faces/facelets/impl/DefaultFacelet;J)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "newInstance", "(Ljava/lang/Object;)Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/net/URL");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/impl/DefaultFaceletCache$2", "newInstance", "(Ljava/net/URL;)Lcom/sun/faces/facelets/impl/DefaultFaceletCache$Record;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
