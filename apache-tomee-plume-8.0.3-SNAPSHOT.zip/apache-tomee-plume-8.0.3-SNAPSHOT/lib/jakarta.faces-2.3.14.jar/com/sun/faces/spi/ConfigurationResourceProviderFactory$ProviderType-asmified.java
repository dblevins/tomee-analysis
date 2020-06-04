package asm.com.sun.faces.spi;
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
public class ConfigurationResourceProviderFactory$ProviderTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType", "Ljava/lang/Enum<Lcom/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType", "com/sun/faces/spi/ConfigurationResourceProviderFactory", "ProviderType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FacesConfig", "Lcom/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FaceletConfig", "Lcom/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "servicesKey", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType", "$VALUES", "[Lcom/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "(Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType", "servicesKey", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FacesConfig");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("com.sun.faces.spi.FacesConfigResourceProvider");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType", "FacesConfig", "Lcom/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FaceletConfig");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("com.sun.faces.spi.FaceletConfigResourceProvider");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType", "FaceletConfig", "Lcom/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType", "FacesConfig", "Lcom/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType", "FaceletConfig", "Lcom/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType", "$VALUES", "[Lcom/sun/faces/spi/ConfigurationResourceProviderFactory$ProviderType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
