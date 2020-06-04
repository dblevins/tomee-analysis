package asm.com.sun.faces.el;
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
public class FacesCompositeELResolver$ELResolverChainTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/faces/el/FacesCompositeELResolver$ELResolverChainType", "Ljava/lang/Enum<Lcom/sun/faces/el/FacesCompositeELResolver$ELResolverChainType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/sun/faces/el/FacesCompositeELResolver$ELResolverChainType", "com/sun/faces/el/FacesCompositeELResolver", "ELResolverChainType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JSP", "Lcom/sun/faces/el/FacesCompositeELResolver$ELResolverChainType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Faces", "Lcom/sun/faces/el/FacesCompositeELResolver$ELResolverChainType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/sun/faces/el/FacesCompositeELResolver$ELResolverChainType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/sun/faces/el/FacesCompositeELResolver$ELResolverChainType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/el/FacesCompositeELResolver$ELResolverChainType", "$VALUES", "[Lcom/sun/faces/el/FacesCompositeELResolver$ELResolverChainType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/faces/el/FacesCompositeELResolver$ELResolverChainType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/faces/el/FacesCompositeELResolver$ELResolverChainType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/sun/faces/el/FacesCompositeELResolver$ELResolverChainType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/el/FacesCompositeELResolver$ELResolverChainType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/el/FacesCompositeELResolver$ELResolverChainType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/el/FacesCompositeELResolver$ELResolverChainType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JSP");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/el/FacesCompositeELResolver$ELResolverChainType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/el/FacesCompositeELResolver$ELResolverChainType", "JSP", "Lcom/sun/faces/el/FacesCompositeELResolver$ELResolverChainType;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/el/FacesCompositeELResolver$ELResolverChainType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Faces");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/el/FacesCompositeELResolver$ELResolverChainType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/el/FacesCompositeELResolver$ELResolverChainType", "Faces", "Lcom/sun/faces/el/FacesCompositeELResolver$ELResolverChainType;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/faces/el/FacesCompositeELResolver$ELResolverChainType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/el/FacesCompositeELResolver$ELResolverChainType", "JSP", "Lcom/sun/faces/el/FacesCompositeELResolver$ELResolverChainType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/el/FacesCompositeELResolver$ELResolverChainType", "Faces", "Lcom/sun/faces/el/FacesCompositeELResolver$ELResolverChainType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/el/FacesCompositeELResolver$ELResolverChainType", "$VALUES", "[Lcom/sun/faces/el/FacesCompositeELResolver$ELResolverChainType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
