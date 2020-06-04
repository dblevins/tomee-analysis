package asm.org.apache.cxf.binding.soap;
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
public class SoapVersionFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/binding/soap/SoapVersionFactory", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "factory", "Lorg/apache/cxf/binding/soap/SoapVersionFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "versions", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Lorg/apache/cxf/binding/soap/SoapVersion;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/binding/soap/SoapVersionFactory", "versions", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "()Lorg/apache/cxf/binding/soap/SoapVersionFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/binding/soap/SoapVersionFactory", "factory", "Lorg/apache/cxf/binding/soap/SoapVersionFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSoapVersion", "(Ljava/lang/String;)Lorg/apache/cxf/binding/soap/SoapVersion;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/binding/soap/SoapVersionFactory", "versions", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/binding/soap/SoapVersion");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "register", "(Lorg/apache/cxf/binding/soap/SoapVersion;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/binding/soap/SoapVersionFactory", "versions", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/binding/soap/SoapVersion", "getNamespace", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getVersions", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Lorg/apache/cxf/binding/soap/SoapVersion;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/binding/soap/SoapVersionFactory", "versions", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "values", "()Ljava/util/Collection;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/binding/soap/SoapVersionFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/binding/soap/SoapVersionFactory", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/binding/soap/SoapVersionFactory", "factory", "Lorg/apache/cxf/binding/soap/SoapVersionFactory;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/SoapVersionFactory", "getInstance", "()Lorg/apache/cxf/binding/soap/SoapVersionFactory;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/Soap11", "getInstance", "()Lorg/apache/cxf/binding/soap/Soap11;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapVersionFactory", "register", "(Lorg/apache/cxf/binding/soap/SoapVersion;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/SoapVersionFactory", "getInstance", "()Lorg/apache/cxf/binding/soap/SoapVersionFactory;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/Soap12", "getInstance", "()Lorg/apache/cxf/binding/soap/Soap12;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapVersionFactory", "register", "(Lorg/apache/cxf/binding/soap/SoapVersion;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
