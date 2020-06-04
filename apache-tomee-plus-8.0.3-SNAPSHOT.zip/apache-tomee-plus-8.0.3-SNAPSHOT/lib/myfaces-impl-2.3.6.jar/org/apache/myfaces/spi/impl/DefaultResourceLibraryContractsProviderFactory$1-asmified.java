package asm.org.apache.myfaces.spi.impl;
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
public class DefaultResourceLibraryContractsProviderFactory$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory$1", "Ljava/lang/Object;Ljava/security/PrivilegedExceptionAction<Lorg/apache/myfaces/spi/ResourceLibraryContractsProvider;>;", "java/lang/Object", new String[] { "java/security/PrivilegedExceptionAction" });

classWriter.visitOuterClass("org/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory", "createResourceLibraryContractsProvider", "(Ljavax/faces/context/ExternalContext;)Lorg/apache/myfaces/spi/ResourceLibraryContractsProvider;");

classWriter.visitInnerClass("org/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$extContext", "Ljavax/faces/context/ExternalContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory;Ljavax/faces/context/ExternalContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory$1", "this$0", "Lorg/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory$1", "val$extContext", "Ljavax/faces/context/ExternalContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()Lorg/apache/myfaces/spi/ResourceLibraryContractsProvider;", null, new String[] { "java/lang/ClassNotFoundException", "java/lang/NoClassDefFoundError", "java/lang/InstantiationException", "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/security/PrivilegedActionException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory$1", "this$0", "Lorg/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory$1", "val$extContext", "Ljavax/faces/context/ExternalContext;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory", "access$000", "(Lorg/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory;Ljavax/faces/context/ExternalContext;)Lorg/apache/myfaces/spi/ResourceLibraryContractsProvider;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "run", "()Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory$1", "run", "()Lorg/apache/myfaces/spi/ResourceLibraryContractsProvider;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
