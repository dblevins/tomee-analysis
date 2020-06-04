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
public class DefaultFaceletFactory$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "com/sun/faces/facelets/impl/DefaultFaceletFactory$1", "Ljava/lang/Object;Ljakarta/faces/view/facelets/FaceletCache$MemberFactory<Lcom/sun/faces/facelets/impl/DefaultFacelet;>;", "java/lang/Object", new String[] { "jakarta/faces/view/facelets/FaceletCache$MemberFactory" });

classWriter.visitOuterClass("com/sun/faces/facelets/impl/DefaultFaceletFactory", "initCache", "(Ljakarta/faces/view/facelets/FaceletCache;)Ljakarta/faces/view/facelets/FaceletCache;");

classWriter.visitInnerClass("com/sun/faces/facelets/impl/DefaultFaceletFactory$1", null, null, 0);

classWriter.visitInnerClass("jakarta/faces/view/facelets/FaceletCache$MemberFactory", "jakarta/faces/view/facelets/FaceletCache", "MemberFactory", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/faces/facelets/impl/DefaultFaceletFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/faces/facelets/impl/DefaultFaceletFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/impl/DefaultFaceletFactory$1", "this$0", "Lcom/sun/faces/facelets/impl/DefaultFaceletFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newInstance", "(Ljava/net/URL;)Lcom/sun/faces/facelets/impl/DefaultFacelet;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/impl/DefaultFaceletFactory$1", "this$0", "Lcom/sun/faces/facelets/impl/DefaultFaceletFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/impl/DefaultFaceletFactory", "access$100", "(Lcom/sun/faces/facelets/impl/DefaultFaceletFactory;Ljava/net/URL;)Lcom/sun/faces/facelets/impl/DefaultFacelet;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "newInstance", "(Ljava/net/URL;)Ljava/lang/Object;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/impl/DefaultFaceletFactory$1", "newInstance", "(Ljava/net/URL;)Lcom/sun/faces/facelets/impl/DefaultFacelet;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
