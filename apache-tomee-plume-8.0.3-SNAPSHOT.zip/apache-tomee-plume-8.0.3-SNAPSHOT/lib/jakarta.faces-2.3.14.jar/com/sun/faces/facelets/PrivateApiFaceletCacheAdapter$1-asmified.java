package asm.com.sun.faces.facelets;
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
public class PrivateApiFaceletCacheAdapter$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "com/sun/faces/facelets/PrivateApiFaceletCacheAdapter$1", "Ljava/lang/Object;Lcom/sun/faces/facelets/FaceletCache$InstanceFactory<TV;>;", "java/lang/Object", new String[] { "com/sun/faces/facelets/FaceletCache$InstanceFactory" });

classWriter.visitOuterClass("com/sun/faces/facelets/PrivateApiFaceletCacheAdapter", "setMemberFactories", "(Ljavax/faces/view/facelets/FaceletCache$MemberFactory;Ljavax/faces/view/facelets/FaceletCache$MemberFactory;)V");

classWriter.visitInnerClass("javax/faces/view/facelets/FaceletCache$MemberFactory", "javax/faces/view/facelets/FaceletCache", "MemberFactory", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("com/sun/faces/facelets/PrivateApiFaceletCacheAdapter$1", null, null, 0);

classWriter.visitInnerClass("com/sun/faces/facelets/FaceletCache$InstanceFactory", "com/sun/faces/facelets/FaceletCache", "InstanceFactory", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$faceletFactory", "Ljavax/faces/view/facelets/FaceletCache$MemberFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/faces/facelets/PrivateApiFaceletCacheAdapter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/faces/facelets/PrivateApiFaceletCacheAdapter;Ljavax/faces/view/facelets/FaceletCache$MemberFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/PrivateApiFaceletCacheAdapter$1", "this$0", "Lcom/sun/faces/facelets/PrivateApiFaceletCacheAdapter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/PrivateApiFaceletCacheAdapter$1", "val$faceletFactory", "Ljavax/faces/view/facelets/FaceletCache$MemberFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newInstance", "(Ljava/net/URL;)Ljava/lang/Object;", "(Ljava/net/URL;)TV;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/PrivateApiFaceletCacheAdapter$1", "val$faceletFactory", "Ljavax/faces/view/facelets/FaceletCache$MemberFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/view/facelets/FaceletCache$MemberFactory", "newInstance", "(Ljava/net/URL;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
