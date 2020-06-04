package asm.org.apache.catalina.mapper;
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
public class Mapper$MappedContextDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/catalina/mapper/Mapper$MappedContext", "Lorg/apache/catalina/mapper/Mapper$MapElement<Ljava/lang/Void;>;", "org/apache/catalina/mapper/Mapper$MapElement", null);

classWriter.visitInnerClass("org/apache/catalina/mapper/Mapper$ContextVersion", "org/apache/catalina/mapper/Mapper", "ContextVersion", ACC_PROTECTED | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/mapper/Mapper$MappedContext", "org/apache/catalina/mapper/Mapper", "MappedContext", ACC_PROTECTED | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/mapper/Mapper$MapElement", "org/apache/catalina/mapper/Mapper", "MapElement", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_VOLATILE, "versions", "[Lorg/apache/catalina/mapper/Mapper$ContextVersion;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Lorg/apache/catalina/mapper/Mapper$ContextVersion;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/mapper/Mapper$MapElement", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/catalina/mapper/Mapper$ContextVersion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/mapper/Mapper$MappedContext", "versions", "[Lorg/apache/catalina/mapper/Mapper$ContextVersion;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
