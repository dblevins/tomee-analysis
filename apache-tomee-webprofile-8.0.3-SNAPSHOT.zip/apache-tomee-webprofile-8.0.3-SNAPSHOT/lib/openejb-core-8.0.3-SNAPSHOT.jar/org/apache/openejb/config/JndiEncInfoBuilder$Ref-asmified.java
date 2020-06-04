package asm.org.apache.openejb.config;
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
public class JndiEncInfoBuilder$RefDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/config/JndiEncInfoBuilder$Ref", null, "java/lang/Object", new String[] { "org/apache/openejb/assembler/classic/EjbResolver$Reference" });

classWriter.visitInnerClass("org/apache/openejb/config/JndiEncInfoBuilder$Ref", "org/apache/openejb/config/JndiEncInfoBuilder", "Ref", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/EjbResolver$Type", "org/apache/openejb/assembler/classic/EjbResolver", "Type", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/EjbResolver$Reference", "org/apache/openejb/assembler/classic/EjbResolver", "Reference", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/openejb/config/JndiEncInfoBuilder$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/openejb/jee/EjbReference$Type", "org/apache/openejb/jee/EjbReference", "Type", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "ref", "Lorg/apache/openejb/jee/EjbReference;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/jee/EjbReference;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/JndiEncInfoBuilder$Ref", "ref", "Lorg/apache/openejb/jee/EjbReference;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/JndiEncInfoBuilder$Ref", "ref", "Lorg/apache/openejb/jee/EjbReference;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/jee/EjbReference", "getName", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEjbLink", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/JndiEncInfoBuilder$Ref", "ref", "Lorg/apache/openejb/jee/EjbReference;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/jee/EjbReference", "getEjbLink", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHome", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/JndiEncInfoBuilder$Ref", "ref", "Lorg/apache/openejb/jee/EjbReference;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/jee/EjbReference", "getHome", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInterface", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/JndiEncInfoBuilder$Ref", "ref", "Lorg/apache/openejb/jee/EjbReference;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/jee/EjbReference", "getInterface", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMappedName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/JndiEncInfoBuilder$Ref", "ref", "Lorg/apache/openejb/jee/EjbReference;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/jee/EjbReference", "getMappedName", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRefType", "()Lorg/apache/openejb/assembler/classic/EjbResolver$Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/config/JndiEncInfoBuilder$1", "$SwitchMap$org$apache$openejb$jee$EjbReference$Type", "[I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/JndiEncInfoBuilder$Ref", "ref", "Lorg/apache/openejb/jee/EjbReference;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/jee/EjbReference", "getRefType", "()Lorg/apache/openejb/jee/EjbReference$Type;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/EjbReference$Type", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
methodVisitor.visitTableSwitchInsn(1, 3, label3, new Label[] { label0, label1, label2 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/EjbResolver$Type", "LOCAL", "Lorg/apache/openejb/assembler/classic/EjbResolver$Type;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/EjbResolver$Type", "REMOTE", "Lorg/apache/openejb/assembler/classic/EjbResolver$Type;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/EjbResolver$Type", "UNKNOWN", "Lorg/apache/openejb/assembler/classic/EjbResolver$Type;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/EjbResolver$Type", "UNKNOWN", "Lorg/apache/openejb/assembler/classic/EjbResolver$Type;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
