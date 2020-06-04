package asm.org.apache.commons.lang3.text;
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
public class StrLookupDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT | ACC_DEPRECATED, "org/apache/commons/lang3/text/StrLookup", "<V:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/commons/lang3/text/StrLookup$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/commons/lang3/text/StrLookup$SystemPropertiesStrLookup", "org/apache/commons/lang3/text/StrLookup", "SystemPropertiesStrLookup", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/lang3/text/StrLookup$MapStrLookup", "org/apache/commons/lang3/text/StrLookup", "MapStrLookup", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "NONE_LOOKUP", "Lorg/apache/commons/lang3/text/StrLookup;", "Lorg/apache/commons/lang3/text/StrLookup<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SYSTEM_PROPERTIES_LOOKUP", "Lorg/apache/commons/lang3/text/StrLookup;", "Lorg/apache/commons/lang3/text/StrLookup<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noneLookup", "()Lorg/apache/commons/lang3/text/StrLookup;", "()Lorg/apache/commons/lang3/text/StrLookup<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/text/StrLookup", "NONE_LOOKUP", "Lorg/apache/commons/lang3/text/StrLookup;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "systemPropertiesLookup", "()Lorg/apache/commons/lang3/text/StrLookup;", "()Lorg/apache/commons/lang3/text/StrLookup<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/text/StrLookup", "SYSTEM_PROPERTIES_LOOKUP", "Lorg/apache/commons/lang3/text/StrLookup;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "mapLookup", "(Ljava/util/Map;)Lorg/apache/commons/lang3/text/StrLookup;", "<V:Ljava/lang/Object;>(Ljava/util/Map<Ljava/lang/String;TV;>;)Lorg/apache/commons/lang3/text/StrLookup<TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/text/StrLookup$MapStrLookup");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/text/StrLookup$MapStrLookup", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lookup", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/text/StrLookup$MapStrLookup");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/text/StrLookup$MapStrLookup", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/text/StrLookup", "NONE_LOOKUP", "Lorg/apache/commons/lang3/text/StrLookup;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/text/StrLookup$SystemPropertiesStrLookup");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/text/StrLookup$SystemPropertiesStrLookup", "<init>", "(Lorg/apache/commons/lang3/text/StrLookup$1;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/text/StrLookup", "SYSTEM_PROPERTIES_LOOKUP", "Lorg/apache/commons/lang3/text/StrLookup;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
