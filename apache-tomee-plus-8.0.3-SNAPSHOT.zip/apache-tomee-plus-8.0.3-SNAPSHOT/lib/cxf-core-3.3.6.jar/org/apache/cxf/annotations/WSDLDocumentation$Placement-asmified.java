package asm.org.apache.cxf.annotations;
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
public class WSDLDocumentation$PlacementDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "Ljava/lang/Enum<Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/cxf/annotations/WSDLDocumentation$Placement", "org/apache/cxf/annotations/WSDLDocumentation", "Placement", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DEFAULT", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TOP", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INPUT_MESSAGE", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OUTPUT_MESSAGE", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FAULT_MESSAGE", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PORT_TYPE", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PORT_TYPE_OPERATION", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PORT_TYPE_OPERATION_INPUT", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PORT_TYPE_OPERATION_OUTPUT", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PORT_TYPE_OPERATION_FAULT", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BINDING", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BINDING_OPERATION", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BINDING_OPERATION_INPUT", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BINDING_OPERATION_OUTPUT", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BINDING_OPERATION_FAULT", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SERVICE", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SERVICE_PORT", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "$VALUES", "[Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/annotations/WSDLDocumentation$Placement");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/annotations/WSDLDocumentation$Placement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DEFAULT");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "DEFAULT", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/annotations/WSDLDocumentation$Placement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TOP");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "TOP", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/annotations/WSDLDocumentation$Placement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INPUT_MESSAGE");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "INPUT_MESSAGE", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/annotations/WSDLDocumentation$Placement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OUTPUT_MESSAGE");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "OUTPUT_MESSAGE", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/annotations/WSDLDocumentation$Placement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FAULT_MESSAGE");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "FAULT_MESSAGE", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/annotations/WSDLDocumentation$Placement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PORT_TYPE");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "PORT_TYPE", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/annotations/WSDLDocumentation$Placement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PORT_TYPE_OPERATION");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "PORT_TYPE_OPERATION", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/annotations/WSDLDocumentation$Placement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PORT_TYPE_OPERATION_INPUT");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "PORT_TYPE_OPERATION_INPUT", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/annotations/WSDLDocumentation$Placement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PORT_TYPE_OPERATION_OUTPUT");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "PORT_TYPE_OPERATION_OUTPUT", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/annotations/WSDLDocumentation$Placement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PORT_TYPE_OPERATION_FAULT");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "PORT_TYPE_OPERATION_FAULT", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/annotations/WSDLDocumentation$Placement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BINDING");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "BINDING", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/annotations/WSDLDocumentation$Placement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BINDING_OPERATION");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "BINDING_OPERATION", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/annotations/WSDLDocumentation$Placement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BINDING_OPERATION_INPUT");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "BINDING_OPERATION_INPUT", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/annotations/WSDLDocumentation$Placement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BINDING_OPERATION_OUTPUT");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "BINDING_OPERATION_OUTPUT", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/annotations/WSDLDocumentation$Placement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BINDING_OPERATION_FAULT");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "BINDING_OPERATION_FAULT", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/annotations/WSDLDocumentation$Placement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SERVICE");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "SERVICE", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/annotations/WSDLDocumentation$Placement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SERVICE_PORT");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "SERVICE_PORT", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/cxf/annotations/WSDLDocumentation$Placement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "DEFAULT", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "TOP", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "INPUT_MESSAGE", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "OUTPUT_MESSAGE", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "FAULT_MESSAGE", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "PORT_TYPE", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "PORT_TYPE_OPERATION", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "PORT_TYPE_OPERATION_INPUT", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "PORT_TYPE_OPERATION_OUTPUT", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "PORT_TYPE_OPERATION_FAULT", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "BINDING", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "BINDING_OPERATION", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "BINDING_OPERATION_INPUT", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "BINDING_OPERATION_OUTPUT", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "BINDING_OPERATION_FAULT", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "SERVICE", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "SERVICE_PORT", "Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/annotations/WSDLDocumentation$Placement", "$VALUES", "[Lorg/apache/cxf/annotations/WSDLDocumentation$Placement;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
