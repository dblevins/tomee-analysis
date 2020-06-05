package asm.com.ibm.wsdl.factory;
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
public class WSDLFactoryImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "com/ibm/wsdl/factory/WSDLFactoryImpl", null, "javax/wsdl/factory/WSDLFactory", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/wsdl/factory/WSDLFactory", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newDefinition", "()Ljavax/wsdl/Definition;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/ibm/wsdl/DefinitionImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ibm/wsdl/DefinitionImpl", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ibm/wsdl/factory/WSDLFactoryImpl", "newPopulatedExtensionRegistry", "()Ljavax/wsdl/extensions/ExtensionRegistry;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/Definition", "setExtensionRegistry", "(Ljavax/wsdl/extensions/ExtensionRegistry;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newWSDLReader", "()Ljavax/wsdl/xml/WSDLReader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/ibm/wsdl/xml/WSDLReaderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ibm/wsdl/xml/WSDLReaderImpl", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newWSDLWriter", "()Ljavax/wsdl/xml/WSDLWriter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/ibm/wsdl/xml/WSDLWriterImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ibm/wsdl/xml/WSDLWriterImpl", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newPopulatedExtensionRegistry", "()Ljavax/wsdl/extensions/ExtensionRegistry;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/ibm/wsdl/extensions/PopulatedExtensionRegistry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ibm/wsdl/extensions/PopulatedExtensionRegistry", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
