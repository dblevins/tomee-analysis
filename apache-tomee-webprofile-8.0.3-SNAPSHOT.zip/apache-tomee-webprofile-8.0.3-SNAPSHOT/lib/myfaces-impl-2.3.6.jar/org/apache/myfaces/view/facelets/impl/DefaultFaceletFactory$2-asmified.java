package asm.org.apache.myfaces.view.facelets.impl;
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
public class DefaultFaceletFactory$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/myfaces/view/facelets/impl/DefaultFaceletFactory$2", "Ljava/lang/Object;Ljakarta/faces/view/facelets/FaceletCache$MemberFactory<Ljakarta/faces/view/facelets/Facelet;>;", "java/lang/Object", new String[] { "jakarta/faces/view/facelets/FaceletCache$MemberFactory" });

classWriter.visitOuterClass("org/apache/myfaces/view/facelets/impl/DefaultFaceletFactory", "<init>", "(Lorg/apache/myfaces/view/facelets/compiler/Compiler;Ljakarta/faces/view/facelets/ResourceResolver;J)V");

classWriter.visitInnerClass("org/apache/myfaces/view/facelets/impl/DefaultFaceletFactory$2", null, null, 0);

classWriter.visitInnerClass("jakarta/faces/view/facelets/FaceletCache$MemberFactory", "jakarta/faces/view/facelets/FaceletCache", "MemberFactory", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/myfaces/view/facelets/impl/DefaultFaceletFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/myfaces/view/facelets/impl/DefaultFaceletFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/view/facelets/impl/DefaultFaceletFactory$2", "this$0", "Lorg/apache/myfaces/view/facelets/impl/DefaultFaceletFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newInstance", "(Ljava/net/URL;)Ljakarta/faces/view/facelets/Facelet;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/impl/DefaultFaceletFactory$2", "this$0", "Lorg/apache/myfaces/view/facelets/impl/DefaultFaceletFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/view/facelets/impl/DefaultFaceletFactory", "access$100", "(Lorg/apache/myfaces/view/facelets/impl/DefaultFaceletFactory;Ljava/net/URL;)Lorg/apache/myfaces/view/facelets/impl/DefaultFacelet;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "newInstance", "(Ljava/net/URL;)Ljava/lang/Object;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/impl/DefaultFaceletFactory$2", "newInstance", "(Ljava/net/URL;)Ljakarta/faces/view/facelets/Facelet;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
