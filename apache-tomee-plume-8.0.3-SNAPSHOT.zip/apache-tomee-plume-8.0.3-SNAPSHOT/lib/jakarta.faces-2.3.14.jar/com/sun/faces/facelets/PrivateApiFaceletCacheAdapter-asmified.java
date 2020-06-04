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
public class PrivateApiFaceletCacheAdapterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "com/sun/faces/facelets/PrivateApiFaceletCacheAdapter", "<V:Ljava/lang/Object;>Ljakarta/faces/view/facelets/FaceletCache<TV;>;", "jakarta/faces/view/facelets/FaceletCache", null);

classWriter.visitInnerClass("com/sun/faces/facelets/PrivateApiFaceletCacheAdapter$2", null, null, 0);

classWriter.visitInnerClass("com/sun/faces/facelets/PrivateApiFaceletCacheAdapter$1", null, null, 0);

classWriter.visitInnerClass("jakarta/faces/view/facelets/FaceletCache$MemberFactory", "jakarta/faces/view/facelets/FaceletCache", "MemberFactory", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("com/sun/faces/facelets/FaceletCache$InstanceFactory", "com/sun/faces/facelets/FaceletCache", "InstanceFactory", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "privateApi", "Lcom/sun/faces/facelets/FaceletCache;", "Lcom/sun/faces/facelets/FaceletCache<TV;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "memberFactory", "Ljakarta/faces/view/facelets/FaceletCache$MemberFactory;", "Ljakarta/faces/view/facelets/FaceletCache$MemberFactory<TV;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "metadataMemberFactory", "Ljakarta/faces/view/facelets/FaceletCache$MemberFactory;", "Ljakarta/faces/view/facelets/FaceletCache$MemberFactory<TV;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/faces/facelets/FaceletCache;)V", "(Lcom/sun/faces/facelets/FaceletCache<TV;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/view/facelets/FaceletCache", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/PrivateApiFaceletCacheAdapter", "privateApi", "Lcom/sun/faces/facelets/FaceletCache;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFacelet", "(Ljava/net/URL;)Ljava/lang/Object;", "(Ljava/net/URL;)TV;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/PrivateApiFaceletCacheAdapter", "privateApi", "Lcom/sun/faces/facelets/FaceletCache;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/FaceletCache", "getFacelet", "(Ljava/net/URL;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getViewMetadataFacelet", "(Ljava/net/URL;)Ljava/lang/Object;", "(Ljava/net/URL;)TV;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/PrivateApiFaceletCacheAdapter", "privateApi", "Lcom/sun/faces/facelets/FaceletCache;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/FaceletCache", "getMetadataFacelet", "(Ljava/net/URL;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isFaceletCached", "(Ljava/net/URL;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/PrivateApiFaceletCacheAdapter", "privateApi", "Lcom/sun/faces/facelets/FaceletCache;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/FaceletCache", "isFaceletCached", "(Ljava/net/URL;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isViewMetadataFaceletCached", "(Ljava/net/URL;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/PrivateApiFaceletCacheAdapter", "privateApi", "Lcom/sun/faces/facelets/FaceletCache;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/FaceletCache", "isMetadataFaceletCached", "(Ljava/net/URL;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMemberFactories", "(Ljakarta/faces/view/facelets/FaceletCache$MemberFactory;Ljakarta/faces/view/facelets/FaceletCache$MemberFactory;)V", "(Ljakarta/faces/view/facelets/FaceletCache$MemberFactory<TV;>;Ljakarta/faces/view/facelets/FaceletCache$MemberFactory<TV;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/PrivateApiFaceletCacheAdapter$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/PrivateApiFaceletCacheAdapter$1", "<init>", "(Lcom/sun/faces/facelets/PrivateApiFaceletCacheAdapter;Ljakarta/faces/view/facelets/FaceletCache$MemberFactory;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/PrivateApiFaceletCacheAdapter$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/PrivateApiFaceletCacheAdapter$2", "<init>", "(Lcom/sun/faces/facelets/PrivateApiFaceletCacheAdapter;Ljakarta/faces/view/facelets/FaceletCache$MemberFactory;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/PrivateApiFaceletCacheAdapter", "privateApi", "Lcom/sun/faces/facelets/FaceletCache;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/FaceletCache", "init", "(Lcom/sun/faces/facelets/FaceletCache$InstanceFactory;Lcom/sun/faces/facelets/FaceletCache$InstanceFactory;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMemberFactory", "()Ljakarta/faces/view/facelets/FaceletCache$MemberFactory;", "()Ljakarta/faces/view/facelets/FaceletCache$MemberFactory<TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/PrivateApiFaceletCacheAdapter", "memberFactory", "Ljakarta/faces/view/facelets/FaceletCache$MemberFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMetadataMemberFactory", "()Ljakarta/faces/view/facelets/FaceletCache$MemberFactory;", "()Ljakarta/faces/view/facelets/FaceletCache$MemberFactory<TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/PrivateApiFaceletCacheAdapter", "metadataMemberFactory", "Ljakarta/faces/view/facelets/FaceletCache$MemberFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
