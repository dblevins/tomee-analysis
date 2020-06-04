package asm.org.apache.cxf.jaxrs.provider.json.utils;
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
public class JSONUtils$JettisonMappedReaderFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/jaxrs/provider/json/utils/JSONUtils$JettisonMappedReaderFactory", null, "org/codehaus/jettison/mapped/MappedXMLInputFactory", null);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/provider/json/utils/JSONUtils$JettisonMappedReaderFactory", "org/apache/cxf/jaxrs/provider/json/utils/JSONUtils", "JettisonMappedReaderFactory", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "depthProps", "Lorg/apache/cxf/staxutils/DocumentDepthProperties;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/codehaus/jettison/mapped/Configuration;Lorg/apache/cxf/staxutils/DocumentDepthProperties;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/jettison/mapped/MappedXMLInputFactory", "<init>", "(Lorg/codehaus/jettison/mapped/Configuration;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/provider/json/utils/JSONUtils$JettisonMappedReaderFactory", "depthProps", "Lorg/apache/cxf/staxutils/DocumentDepthProperties;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createNewJSONTokener", "(Ljava/lang/String;)Lorg/codehaus/jettison/json/JSONTokener;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/jettison/json/JSONTokener");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/provider/json/utils/JSONUtils$JettisonMappedReaderFactory", "depthProps", "Lorg/apache/cxf/staxutils/DocumentDepthProperties;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/staxutils/DocumentDepthProperties", "getInnerElementCountThreshold", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/jettison/json/JSONTokener", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
