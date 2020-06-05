package asm.org.apache.jasper.compiler;
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
public class Generator$1ScriptingVarVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/jasper/compiler/Generator$1ScriptingVarVisitor", null, "org/apache/jasper/compiler/Node$Visitor", null);

classWriter.visitOuterClass("org/apache/jasper/compiler/Generator", "declareTemporaryScriptingVars", "(Lorg/apache/jasper/compiler/Node$Nodes;)V");

classWriter.visitInnerClass("org/apache/jasper/compiler/Generator$1ScriptingVarVisitor", null, "ScriptingVarVisitor", 0);

classWriter.visitInnerClass("org/apache/jasper/compiler/Node$CustomTag", "org/apache/jasper/compiler/Node", "CustomTag", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/compiler/Node$Visitor", "org/apache/jasper/compiler/Node", "Visitor", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/compiler/Node$Nodes", "org/apache/jasper/compiler/Node", "Nodes", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "vars", "Ljava/util/Vector;", "Ljava/util/Vector<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/jasper/compiler/Generator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/jasper/compiler/Generator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/compiler/Generator$1ScriptingVarVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jasper/compiler/Node$Visitor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/Vector");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Vector", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/compiler/Generator$1ScriptingVarVisitor", "vars", "Ljava/util/Vector;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/apache/jasper/compiler/Node$CustomTag;)V", null, new String[] { "org/apache/jasper/JasperException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "getCustomNestingLevel", "()I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "getTagVariableInfos", "()[Ljakarta/servlet/jsp/tagext/TagVariableInfo;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "getVariableInfos", "()[Ljakarta/servlet/jsp/tagext/VariableInfo;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 6);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/jasper/compiler/Generator$1ScriptingVarVisitor", "org/apache/jasper/compiler/Node$CustomTag", "[Ljakarta/servlet/jsp/tagext/TagVariableInfo;", "[Ljakarta/servlet/jsp/tagext/VariableInfo;", "[Ljakarta/servlet/jsp/tagext/VariableInfo;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 5);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/servlet/jsp/tagext/VariableInfo", "getVarName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("_jspx_");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("_");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "getCustomNestingLevel", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1ScriptingVarVisitor", "vars", "Ljava/util/Vector;");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "contains", "(Ljava/lang/Object;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1ScriptingVarVisitor", "vars", "Ljava/util/Vector;");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1ScriptingVarVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "access$000", "(Lorg/apache/jasper/compiler/Generator;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/servlet/jsp/tagext/VariableInfo", "getClassName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "printin", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1ScriptingVarVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "access$000", "(Lorg/apache/jasper/compiler/Generator;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitLdcInsn(" ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "print", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1ScriptingVarVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "access$000", "(Lorg/apache/jasper/compiler/Generator;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "print", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1ScriptingVarVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "access$000", "(Lorg/apache/jasper/compiler/Generator;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitLdcInsn(" = ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "print", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1ScriptingVarVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "access$000", "(Lorg/apache/jasper/compiler/Generator;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "print", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1ScriptingVarVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "access$000", "(Lorg/apache/jasper/compiler/Generator;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitLdcInsn(";");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "println", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 6);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Ljakarta/servlet/jsp/tagext/TagVariableInfo;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/servlet/jsp/tagext/TagVariableInfo", "getNameGiven", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "getTagData", "()Ljakarta/servlet/jsp/tagext/TagData;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/servlet/jsp/tagext/TagVariableInfo", "getNameFromAttribute", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/servlet/jsp/tagext/TagData", "getAttributeString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"jakarta/servlet/jsp/tagext/TagVariableInfo", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/servlet/jsp/tagext/TagVariableInfo", "getNameFromAttribute", "()Ljava/lang/String;", false);
methodVisitor.visitJumpInsn(IFNULL, label7);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("_jspx_");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("_");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "getCustomNestingLevel", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1ScriptingVarVisitor", "vars", "Ljava/util/Vector;");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "contains", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1ScriptingVarVisitor", "vars", "Ljava/util/Vector;");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1ScriptingVarVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "access$000", "(Lorg/apache/jasper/compiler/Generator;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/servlet/jsp/tagext/TagVariableInfo", "getClassName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "printin", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1ScriptingVarVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "access$000", "(Lorg/apache/jasper/compiler/Generator;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitLdcInsn(" ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "print", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1ScriptingVarVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "access$000", "(Lorg/apache/jasper/compiler/Generator;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "print", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1ScriptingVarVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "access$000", "(Lorg/apache/jasper/compiler/Generator;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitLdcInsn(" = ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "print", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1ScriptingVarVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "access$000", "(Lorg/apache/jasper/compiler/Generator;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "print", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1ScriptingVarVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "access$000", "(Lorg/apache/jasper/compiler/Generator;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitLdcInsn(";");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "println", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/jasper/compiler/Generator$1ScriptingVarVisitor", "org/apache/jasper/compiler/Node$CustomTag"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Generator$1ScriptingVarVisitor", "visitBody", "(Lorg/apache/jasper/compiler/Node;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 10);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}