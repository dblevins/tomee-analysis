package asm.org.apache.cxf.jaxrs.json.basic;
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
public class JsonMapObjectReaderWriter$StringBuilderOutputDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter$StringBuilderOutput", null, "java/lang/Object", new String[] { "org/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter$Output" });

classWriter.visitInnerClass("org/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter$StringBuilderOutput", "org/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter", "StringBuilderOutput", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter$Output", "org/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter", "Output", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "sb", "Ljava/lang/StringBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter;Ljava/lang/StringBuilder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter$StringBuilderOutput", "this$0", "Lorg/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter$StringBuilderOutput", "sb", "Ljava/lang/StringBuilder;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "append", "(Ljava/lang/String;)Lorg/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter$Output;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter$StringBuilderOutput", "sb", "Ljava/lang/StringBuilder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "append", "(C)Lorg/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter$Output;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/json/basic/JsonMapObjectReaderWriter$StringBuilderOutput", "sb", "Ljava/lang/StringBuilder;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
