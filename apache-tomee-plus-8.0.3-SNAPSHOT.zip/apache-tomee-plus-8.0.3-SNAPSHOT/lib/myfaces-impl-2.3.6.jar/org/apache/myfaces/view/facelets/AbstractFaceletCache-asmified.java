package asm.org.apache.myfaces.view.facelets;
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
public class AbstractFaceletCacheDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/myfaces/view/facelets/AbstractFaceletCache", "<V:Ljava/lang/Object;>Ljavax/faces/view/facelets/FaceletCache<TV;>;", "javax/faces/view/facelets/FaceletCache", null);

classWriter.visitInnerClass("javax/faces/view/facelets/FaceletCache$MemberFactory", "javax/faces/view/facelets/FaceletCache", "MemberFactory", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_compositeComponentMetadataFaceletFactory", "Ljavax/faces/view/facelets/FaceletCache$MemberFactory;", "Ljavax/faces/view/facelets/FaceletCache$MemberFactory<TV;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/view/facelets/FaceletCache", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFacelet", "(Ljavax/faces/view/facelets/FaceletContext;Ljava/net/URL;)Ljava/lang/Object;", "(Ljavax/faces/view/facelets/FaceletContext;Ljava/net/URL;)TV;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/AbstractFaceletCache", "getFacelet", "(Ljava/net/URL;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCompositeComponentMetadataFacelet", "(Ljava/net/URL;)Ljava/lang/Object;", "(Ljava/net/URL;)TV;", new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isCompositeComponentMetadataFaceletCached", "(Ljava/net/URL;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setMemberFactories", "(Ljavax/faces/view/facelets/FaceletCache$MemberFactory;Ljavax/faces/view/facelets/FaceletCache$MemberFactory;Ljavax/faces/view/facelets/FaceletCache$MemberFactory;)V", "(Ljavax/faces/view/facelets/FaceletCache$MemberFactory<TV;>;Ljavax/faces/view/facelets/FaceletCache$MemberFactory<TV;>;Ljavax/faces/view/facelets/FaceletCache$MemberFactory<TV;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("viewMetadataFaceletFactory is null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/view/facelets/AbstractFaceletCache", "_compositeComponentMetadataFaceletFactory", "Ljavax/faces/view/facelets/FaceletCache$MemberFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/AbstractFaceletCache", "setCacheFactories", "(Ljavax/faces/view/facelets/FaceletCache$MemberFactory;Ljavax/faces/view/facelets/FaceletCache$MemberFactory;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getCompositeComponentMetadataMemberFactory", "()Ljavax/faces/view/facelets/FaceletCache$MemberFactory;", "()Ljavax/faces/view/facelets/FaceletCache$MemberFactory<TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/AbstractFaceletCache", "_compositeComponentMetadataFaceletFactory", "Ljavax/faces/view/facelets/FaceletCache$MemberFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCacheFactories", "(Ljavax/faces/view/facelets/FaceletCache$MemberFactory;Ljavax/faces/view/facelets/FaceletCache$MemberFactory;Ljavax/faces/view/facelets/FaceletCache$MemberFactory;)V", "(Ljavax/faces/view/facelets/FaceletCache$MemberFactory<TV;>;Ljavax/faces/view/facelets/FaceletCache$MemberFactory<TV;>;Ljavax/faces/view/facelets/FaceletCache$MemberFactory<TV;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/AbstractFaceletCache", "setMemberFactories", "(Ljavax/faces/view/facelets/FaceletCache$MemberFactory;Ljavax/faces/view/facelets/FaceletCache$MemberFactory;Ljavax/faces/view/facelets/FaceletCache$MemberFactory;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
