package asm.org.apache.cxf.service.factory;
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
public class FactoryBeanListener$EventDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "Ljava/lang/Enum<Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/cxf/service/factory/FactoryBeanListener$Event", "org/apache/cxf/service/factory/FactoryBeanListener", "Event", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "START_CREATE", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "END_CREATE", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CREATE_FROM_WSDL", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CREATE_FROM_CLASS", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WSDL_LOADED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SERVICE_SET", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INTERFACE_OPERATION_BOUND", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OPERATIONINFO_IN_MESSAGE_SET", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OPERATIONINFO_OUT_MESSAGE_SET", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OPERATIONINFO_FAULT", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INTERFACE_CREATED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DATABINDING_INITIALIZED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ENDPOINT_CREATED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PRE_SERVER_CREATE", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SERVER_CREATED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BINDING_OPERATION_CREATED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BINDING_CREATED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PRE_CLIENT_CREATE", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CLIENT_CREATED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ENDPOINT_SELECTED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ENDPOINTINFO_CREATED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PROXY_CREATED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "$VALUES", "[Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/service/factory/FactoryBeanListener$Event");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/service/factory/FactoryBeanListener$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("START_CREATE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "START_CREATE", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/service/factory/FactoryBeanListener$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("END_CREATE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "END_CREATE", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/service/factory/FactoryBeanListener$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CREATE_FROM_WSDL");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "CREATE_FROM_WSDL", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/service/factory/FactoryBeanListener$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CREATE_FROM_CLASS");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "CREATE_FROM_CLASS", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/service/factory/FactoryBeanListener$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WSDL_LOADED");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "WSDL_LOADED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/service/factory/FactoryBeanListener$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SERVICE_SET");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "SERVICE_SET", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/service/factory/FactoryBeanListener$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INTERFACE_OPERATION_BOUND");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "INTERFACE_OPERATION_BOUND", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/service/factory/FactoryBeanListener$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OPERATIONINFO_IN_MESSAGE_SET");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "OPERATIONINFO_IN_MESSAGE_SET", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/service/factory/FactoryBeanListener$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OPERATIONINFO_OUT_MESSAGE_SET");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "OPERATIONINFO_OUT_MESSAGE_SET", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/service/factory/FactoryBeanListener$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OPERATIONINFO_FAULT");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "OPERATIONINFO_FAULT", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/service/factory/FactoryBeanListener$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INTERFACE_CREATED");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "INTERFACE_CREATED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/service/factory/FactoryBeanListener$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DATABINDING_INITIALIZED");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "DATABINDING_INITIALIZED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/service/factory/FactoryBeanListener$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ENDPOINT_CREATED");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "ENDPOINT_CREATED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/service/factory/FactoryBeanListener$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PRE_SERVER_CREATE");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "PRE_SERVER_CREATE", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/service/factory/FactoryBeanListener$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SERVER_CREATED");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "SERVER_CREATED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/service/factory/FactoryBeanListener$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BINDING_OPERATION_CREATED");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "BINDING_OPERATION_CREATED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/service/factory/FactoryBeanListener$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BINDING_CREATED");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "BINDING_CREATED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/service/factory/FactoryBeanListener$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PRE_CLIENT_CREATE");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "PRE_CLIENT_CREATE", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/service/factory/FactoryBeanListener$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CLIENT_CREATED");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "CLIENT_CREATED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/service/factory/FactoryBeanListener$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ENDPOINT_SELECTED");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "ENDPOINT_SELECTED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/service/factory/FactoryBeanListener$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ENDPOINTINFO_CREATED");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "ENDPOINTINFO_CREATED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/service/factory/FactoryBeanListener$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PROXY_CREATED");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "PROXY_CREATED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/cxf/service/factory/FactoryBeanListener$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "START_CREATE", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "END_CREATE", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "CREATE_FROM_WSDL", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "CREATE_FROM_CLASS", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "WSDL_LOADED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "SERVICE_SET", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "INTERFACE_OPERATION_BOUND", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "OPERATIONINFO_IN_MESSAGE_SET", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "OPERATIONINFO_OUT_MESSAGE_SET", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "OPERATIONINFO_FAULT", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "INTERFACE_CREATED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "DATABINDING_INITIALIZED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "ENDPOINT_CREATED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "PRE_SERVER_CREATE", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "SERVER_CREATED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "BINDING_OPERATION_CREATED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "BINDING_CREATED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "PRE_CLIENT_CREATE", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "CLIENT_CREATED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "ENDPOINT_SELECTED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "ENDPOINTINFO_CREATED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "PROXY_CREATED", "Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/service/factory/FactoryBeanListener$Event", "$VALUES", "[Lorg/apache/cxf/service/factory/FactoryBeanListener$Event;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
