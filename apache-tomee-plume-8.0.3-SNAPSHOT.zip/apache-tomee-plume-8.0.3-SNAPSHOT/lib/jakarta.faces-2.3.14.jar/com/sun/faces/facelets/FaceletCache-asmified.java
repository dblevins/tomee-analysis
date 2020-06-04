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
public class FaceletCacheDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT | ACC_DEPRECATED, "com/sun/faces/facelets/FaceletCache", "<V:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("com/sun/faces/facelets/FaceletCache$InstanceFactory", "com/sun/faces/facelets/FaceletCache", "InstanceFactory", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_faceletFactory", "Lcom/sun/faces/facelets/FaceletCache$InstanceFactory;", "Lcom/sun/faces/facelets/FaceletCache$InstanceFactory<TV;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_metafaceletFactory", "Lcom/sun/faces/facelets/FaceletCache$InstanceFactory;", "Lcom/sun/faces/facelets/FaceletCache$InstanceFactory<TV;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getFacelet", "(Ljava/net/URL;)Ljava/lang/Object;", "(Ljava/net/URL;)TV;", new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isFaceletCached", "(Ljava/net/URL;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMetadataFacelet", "(Ljava/net/URL;)Ljava/lang/Object;", "(Ljava/net/URL;)TV;", new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isMetadataFaceletCached", "(Ljava/net/URL;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "init", "(Lcom/sun/faces/facelets/FaceletCache$InstanceFactory;Lcom/sun/faces/facelets/FaceletCache$InstanceFactory;)V", "(Lcom/sun/faces/facelets/FaceletCache$InstanceFactory<TV;>;Lcom/sun/faces/facelets/FaceletCache$InstanceFactory<TV;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/FaceletCache", "_faceletFactory", "Lcom/sun/faces/facelets/FaceletCache$InstanceFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/FaceletCache", "_metafaceletFactory", "Lcom/sun/faces/facelets/FaceletCache$InstanceFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_FINAL, "getFaceletInstanceFactory", "()Lcom/sun/faces/facelets/FaceletCache$InstanceFactory;", "()Lcom/sun/faces/facelets/FaceletCache$InstanceFactory<TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/FaceletCache", "_faceletFactory", "Lcom/sun/faces/facelets/FaceletCache$InstanceFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_FINAL, "getMetadataFaceletInstanceFactory", "()Lcom/sun/faces/facelets/FaceletCache$InstanceFactory;", "()Lcom/sun/faces/facelets/FaceletCache$InstanceFactory<TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/FaceletCache", "_metafaceletFactory", "Lcom/sun/faces/facelets/FaceletCache$InstanceFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
