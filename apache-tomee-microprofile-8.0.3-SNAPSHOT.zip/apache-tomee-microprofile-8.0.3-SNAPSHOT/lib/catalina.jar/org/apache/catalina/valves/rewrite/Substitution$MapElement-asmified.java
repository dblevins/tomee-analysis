package asm.org.apache.catalina.valves.rewrite;
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
public class Substitution$MapElementDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/catalina/valves/rewrite/Substitution$MapElement", null, "org/apache/catalina/valves/rewrite/Substitution$SubstitutionElement", null);

classWriter.visitInnerClass("org/apache/catalina/valves/rewrite/Substitution$SubstitutionElement", "org/apache/catalina/valves/rewrite/Substitution", "SubstitutionElement", ACC_PUBLIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/catalina/valves/rewrite/Substitution$MapElement", "org/apache/catalina/valves/rewrite/Substitution", "MapElement", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "map", "Lorg/apache/catalina/valves/rewrite/RewriteMap;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "defaultValue", "[Lorg/apache/catalina/valves/rewrite/Substitution$SubstitutionElement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "key", "[Lorg/apache/catalina/valves/rewrite/Substitution$SubstitutionElement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/catalina/valves/rewrite/Substitution;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/catalina/valves/rewrite/Substitution;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/rewrite/Substitution$MapElement", "this$0", "Lorg/apache/catalina/valves/rewrite/Substitution;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/rewrite/Substitution$SubstitutionElement", "<init>", "(Lorg/apache/catalina/valves/rewrite/Substitution;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/rewrite/Substitution$MapElement", "map", "Lorg/apache/catalina/valves/rewrite/RewriteMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/rewrite/Substitution$MapElement", "defaultValue", "[Lorg/apache/catalina/valves/rewrite/Substitution$SubstitutionElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/rewrite/Substitution$MapElement", "key", "[Lorg/apache/catalina/valves/rewrite/Substitution$SubstitutionElement;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluate", "(Ljava/util/regex/Matcher;Ljava/util/regex/Matcher;Lorg/apache/catalina/valves/rewrite/Resolver;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/rewrite/Substitution$MapElement", "map", "Lorg/apache/catalina/valves/rewrite/RewriteMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/rewrite/Substitution$MapElement", "this$0", "Lorg/apache/catalina/valves/rewrite/Substitution;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/rewrite/Substitution$MapElement", "key", "[Lorg/apache/catalina/valves/rewrite/Substitution$SubstitutionElement;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/valves/rewrite/Substitution", "access$100", "(Lorg/apache/catalina/valves/rewrite/Substitution;[Lorg/apache/catalina/valves/rewrite/Substitution$SubstitutionElement;Ljava/util/regex/Matcher;Ljava/util/regex/Matcher;Lorg/apache/catalina/valves/rewrite/Resolver;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/valves/rewrite/RewriteMap", "lookup", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/rewrite/Substitution$MapElement", "defaultValue", "[Lorg/apache/catalina/valves/rewrite/Substitution$SubstitutionElement;");
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/rewrite/Substitution$MapElement", "this$0", "Lorg/apache/catalina/valves/rewrite/Substitution;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/rewrite/Substitution$MapElement", "defaultValue", "[Lorg/apache/catalina/valves/rewrite/Substitution$SubstitutionElement;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/valves/rewrite/Substitution", "access$100", "(Lorg/apache/catalina/valves/rewrite/Substitution;[Lorg/apache/catalina/valves/rewrite/Substitution$SubstitutionElement;Ljava/util/regex/Matcher;Ljava/util/regex/Matcher;Lorg/apache/catalina/valves/rewrite/Resolver;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
