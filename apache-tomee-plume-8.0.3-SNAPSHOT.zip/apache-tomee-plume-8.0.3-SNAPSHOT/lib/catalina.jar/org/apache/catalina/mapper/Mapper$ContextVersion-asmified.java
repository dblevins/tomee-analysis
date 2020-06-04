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
public class Mapper$ContextVersionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/catalina/mapper/Mapper$ContextVersion", "Lorg/apache/catalina/mapper/Mapper$MapElement<Lorg/apache/catalina/Context;>;", "org/apache/catalina/mapper/Mapper$MapElement", null);

classWriter.visitInnerClass("org/apache/catalina/mapper/Mapper$MappedWrapper", "org/apache/catalina/mapper/Mapper", "MappedWrapper", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/mapper/Mapper$ContextVersion", "org/apache/catalina/mapper/Mapper", "ContextVersion", ACC_PROTECTED | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/mapper/Mapper$MapElement", "org/apache/catalina/mapper/Mapper", "MapElement", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "path", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "slashCount", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "resources", "Lorg/apache/catalina/WebResourceRoot;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "welcomeResources", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "defaultWrapper", "Lorg/apache/catalina/mapper/Mapper$MappedWrapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "exactWrappers", "[Lorg/apache/catalina/mapper/Mapper$MappedWrapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "wildcardWrappers", "[Lorg/apache/catalina/mapper/Mapper$MappedWrapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "extensionWrappers", "[Lorg/apache/catalina/mapper/Mapper$MappedWrapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "nesting", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "paused", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljava/lang/String;ILorg/apache/catalina/Context;Lorg/apache/catalina/WebResourceRoot;[Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/mapper/Mapper$MapElement", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/mapper/Mapper$ContextVersion", "defaultWrapper", "Lorg/apache/catalina/mapper/Mapper$MappedWrapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/catalina/mapper/Mapper$MappedWrapper");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/mapper/Mapper$ContextVersion", "exactWrappers", "[Lorg/apache/catalina/mapper/Mapper$MappedWrapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/catalina/mapper/Mapper$MappedWrapper");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/mapper/Mapper$ContextVersion", "wildcardWrappers", "[Lorg/apache/catalina/mapper/Mapper$MappedWrapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/catalina/mapper/Mapper$MappedWrapper");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/mapper/Mapper$ContextVersion", "extensionWrappers", "[Lorg/apache/catalina/mapper/Mapper$MappedWrapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/mapper/Mapper$ContextVersion", "nesting", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/mapper/Mapper$ContextVersion", "path", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/mapper/Mapper$ContextVersion", "slashCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/mapper/Mapper$ContextVersion", "resources", "Lorg/apache/catalina/WebResourceRoot;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/mapper/Mapper$ContextVersion", "welcomeResources", "[Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isPaused", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/mapper/Mapper$ContextVersion", "paused", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "markPaused", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/mapper/Mapper$ContextVersion", "paused", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
