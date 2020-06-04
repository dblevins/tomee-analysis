package asm.org.apache.openjpa.jdbc.meta;
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
public class ReverseMappingTool$ReverseCodeGeneratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", null, "org/apache/openjpa/enhance/CodeGenerator", null);

classWriter.visitInnerClass("org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", "org/apache/openjpa/jdbc/meta/ReverseMappingTool", "ReverseCodeGenerator", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_mapping", "Lorg/apache/openjpa/jdbc/meta/ClassMapping;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_appid", "Lorg/apache/openjpa/enhance/ApplicationIdTool;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;Lorg/apache/openjpa/jdbc/meta/ClassMapping;Lorg/apache/openjpa/enhance/ApplicationIdTool;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", "this$0", "Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/enhance/CodeGenerator", "<init>", "(Lorg/apache/openjpa/meta/ClassMetaData;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/meta/ReverseMappingTool", "access$200", "(Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;)Ljava/io/File;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/enhance/CodeGenerator", "setDirectory", "(Ljava/io/File;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/meta/ReverseMappingTool", "access$300", "(Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;)Lorg/apache/openjpa/lib/util/CodeFormat;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/enhance/CodeGenerator", "setCodeFormat", "(Lorg/apache/openjpa/lib/util/CodeFormat;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", "_mapping", "Lorg/apache/openjpa/jdbc/meta/ClassMapping;");
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/enhance/ApplicationIdTool", "isInnerClass", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", "_appid", "Lorg/apache/openjpa/enhance/ApplicationIdTool;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", "org/apache/openjpa/jdbc/meta/ReverseMappingTool", "org/apache/openjpa/jdbc/meta/ClassMapping", "org/apache/openjpa/enhance/ApplicationIdTool"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", "_appid", "Lorg/apache/openjpa/enhance/ApplicationIdTool;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "closeClassBrace", "(Lorg/apache/openjpa/lib/util/CodeFormat;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", "_appid", "Lorg/apache/openjpa/enhance/ApplicationIdTool;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/CodeFormat", "afterSection", "()Lorg/apache/openjpa/lib/util/CodeFormat;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", "_appid", "Lorg/apache/openjpa/enhance/ApplicationIdTool;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/enhance/ApplicationIdTool", "getCode", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/CodeFormat", "append", "(Ljava/lang/Object;)Lorg/apache/openjpa/lib/util/CodeFormat;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/CodeFormat", "endl", "()Lorg/apache/openjpa/lib/util/CodeFormat;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/enhance/CodeGenerator", "closeClassBrace", "(Lorg/apache/openjpa/lib/util/CodeFormat;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getImportPackages", "()Ljava/util/Set;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/enhance/CodeGenerator", "getImportPackages", "()Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", "_appid", "Lorg/apache/openjpa/enhance/ApplicationIdTool;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", "_appid", "Lorg/apache/openjpa/enhance/ApplicationIdTool;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/enhance/ApplicationIdTool", "getImportPackages", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Set"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getClassCode", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", "this$0", "Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/meta/ReverseMappingTool", "access$400", "(Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;)Lorg/apache/openjpa/jdbc/meta/ReverseCustomizer;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", "this$0", "Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/meta/ReverseMappingTool", "access$400", "(Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;)Lorg/apache/openjpa/jdbc/meta/ReverseCustomizer;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", "_mapping", "Lorg/apache/openjpa/jdbc/meta/ClassMapping;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/meta/ReverseCustomizer", "getClassCode", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;)Ljava/lang/String;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getInitialValue", "(Lorg/apache/openjpa/meta/FieldMetaData;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", "this$0", "Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/meta/ReverseMappingTool", "access$400", "(Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;)Lorg/apache/openjpa/jdbc/meta/ReverseCustomizer;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", "this$0", "Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/meta/ReverseMappingTool", "access$400", "(Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;)Lorg/apache/openjpa/jdbc/meta/ReverseCustomizer;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/jdbc/meta/FieldMapping");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/meta/ReverseCustomizer", "getInitialValue", "(Lorg/apache/openjpa/jdbc/meta/FieldMapping;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getDeclaration", "(Lorg/apache/openjpa/meta/FieldMetaData;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", "this$0", "Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/meta/ReverseMappingTool", "access$400", "(Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;)Lorg/apache/openjpa/jdbc/meta/ReverseCustomizer;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", "this$0", "Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/meta/ReverseMappingTool", "access$400", "(Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;)Lorg/apache/openjpa/jdbc/meta/ReverseCustomizer;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/jdbc/meta/FieldMapping");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/meta/ReverseCustomizer", "getDeclaration", "(Lorg/apache/openjpa/jdbc/meta/FieldMapping;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getFieldCode", "(Lorg/apache/openjpa/meta/FieldMetaData;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", "this$0", "Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/meta/ReverseMappingTool", "access$400", "(Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;)Lorg/apache/openjpa/jdbc/meta/ReverseCustomizer;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", "this$0", "Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/meta/ReverseMappingTool", "access$400", "(Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;)Lorg/apache/openjpa/jdbc/meta/ReverseCustomizer;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/jdbc/meta/FieldMapping");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/meta/ReverseCustomizer", "getFieldCode", "(Lorg/apache/openjpa/jdbc/meta/FieldMapping;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "useGenericCollections", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", "this$0", "Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/meta/ReverseMappingTool", "access$500", "(Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
