package asm.org.apache.tomee.catalina;
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
public class LinkageErrorProtectionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomee/catalina/LinkageErrorProtection", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "preload", "(Lorg/apache/catalina/core/StandardContext;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Throwable");
methodVisitor.visitLabel(label3);
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.ErrorData");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.HttpJspPage");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.JspApplicationContext");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.JspContext");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.JspEngineInfo");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.JspException");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.JspFactory");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.JspPage");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.JspTagException");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.JspWriter");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.PageContext");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.SkipPageException");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.el.ELException");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.el.ELParseException");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.el.Expression");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.el.ExpressionEvaluator");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.el.FunctionMapper");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.el.ImplicitObjectELResolver$1");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.el.ImplicitObjectELResolver$ScopeManager$1");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.el.ImplicitObjectELResolver$ScopeManager$10");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.el.ImplicitObjectELResolver$ScopeManager$2");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.el.ImplicitObjectELResolver$ScopeManager$3");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.el.ImplicitObjectELResolver$ScopeManager$4");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.el.ImplicitObjectELResolver$ScopeManager$5");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.el.ImplicitObjectELResolver$ScopeManager$6");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.el.ImplicitObjectELResolver$ScopeManager$7");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.el.ImplicitObjectELResolver$ScopeManager$8");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.el.ImplicitObjectELResolver$ScopeManager$9");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.el.ImplicitObjectELResolver$ScopeManager");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.el.ImplicitObjectELResolver$ScopeMap$ScopeEntry");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.el.ImplicitObjectELResolver$ScopeMap");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.el.ImplicitObjectELResolver");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.el.ScopedAttributeELResolver");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.el.VariableResolver");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.BodyContent");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.BodyTag");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.BodyTagSupport");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.DynamicAttributes");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.FunctionInfo");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.IterationTag");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.JspFragment");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.JspIdConsumer");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.JspTag");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.PageData");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.SimpleTag");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.SimpleTagSupport");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.Tag");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.TagAdapter");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.TagAttributeInfo");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.TagData");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.TagExtraInfo");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 51);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.TagFileInfo");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 52);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.TagInfo");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 53);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.TagLibraryInfo");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 54);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.TagLibraryValidator");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 55);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.TagSupport");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 56);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.TagVariableInfo");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.TryCatchFinally");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.ValidationMessage");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 59);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.tagext.VariableInfo");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/catalina/core/StandardContext", "[Ljava/lang/String;", "[Ljava/lang/String;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitJumpInsn(IF_ICMPGE, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/catalina/LinkageErrorProtection", "load", "(Ljava/lang/String;Lorg/apache/catalina/core/StandardContext;)V", false);
methodVisitor.visitLabel(label1);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/catalina/core/StandardContext", "[Ljava/lang/String;", "[Ljava/lang/String;", Opcodes.INTEGER, Opcodes.INTEGER, "java/lang/String"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/apache/catalina/core/StandardContext"}, 0, new Object[] {});
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "load", "(Ljava/lang/String;Lorg/apache/catalina/core/StandardContext;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassNotFoundException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/LinkageError");
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label4, label5, label6, "java/lang/ClassNotFoundException");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/core/StandardContext", "getLoader", "()Lorg/apache/catalina/Loader;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/Loader", "getClassLoader", "()Ljava/lang/ClassLoader;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ClassLoader", "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"java/lang/String", "org/apache/catalina/core/StandardContext", "java/lang/ClassLoader"}, 1, new Object[] {"java/lang/ClassNotFoundException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/LinkageError"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ClassLoader", "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label5);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"java/lang/String", "org/apache/catalina/core/StandardContext", "java/lang/ClassLoader", "java/lang/LinkageError"}, 1, new Object[] {"java/lang/ClassNotFoundException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
