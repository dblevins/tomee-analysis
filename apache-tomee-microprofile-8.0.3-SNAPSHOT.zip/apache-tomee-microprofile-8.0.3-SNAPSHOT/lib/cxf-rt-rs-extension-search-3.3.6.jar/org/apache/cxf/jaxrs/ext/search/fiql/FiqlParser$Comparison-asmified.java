package asm.org.apache.cxf.jaxrs.ext.search.fiql;
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
public class FiqlParser$ComparisonDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$Comparison", "Ljava/lang/Object;Lorg/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$ASTNode<TT;>;", "java/lang/Object", new String[] { "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$ASTNode" });

classWriter.visitInnerClass("org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$TypeInfoObject", "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser", "TypeInfoObject", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$Comparison", "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser", "Comparison", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$ASTNode", "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser", "ASTNode", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/ext/search/Beanspector$TypeInfo", "org/apache/cxf/jaxrs/ext/search/Beanspector", "TypeInfo", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "operator", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "tvalue", "Lorg/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$TypeInfoObject;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/jaxrs/ext/search/fiql/FiqlParser;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/jaxrs/ext/search/fiql/FiqlParser;Ljava/lang/String;Ljava/lang/String;Lorg/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$TypeInfoObject;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$Comparison", "this$0", "Lorg/apache/cxf/jaxrs/ext/search/fiql/FiqlParser;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$Comparison", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$Comparison", "operator", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$Comparison", "tvalue", "Lorg/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$TypeInfoObject;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$Comparison", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$Comparison", "operator", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$Comparison", "tvalue", "Lorg/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$TypeInfoObject;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$TypeInfoObject", "getObject", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" (");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$Comparison", "tvalue", "Lorg/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$TypeInfoObject;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$TypeInfoObject", "getObject", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getSimpleName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(")");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "build", "()Lorg/apache/cxf/jaxrs/ext/search/SearchCondition;", "()Lorg/apache/cxf/jaxrs/ext/search/SearchCondition<TT;>;", new String[] { "org/apache/cxf/jaxrs/ext/search/SearchParseException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$Comparison", "this$0", "Lorg/apache/cxf/jaxrs/ext/search/fiql/FiqlParser;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$Comparison", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser", "access$000", "(Lorg/apache/cxf/jaxrs/ext/search/fiql/FiqlParser;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$Comparison", "createTemplate", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$Comparison", "this$0", "Lorg/apache/cxf/jaxrs/ext/search/fiql/FiqlParser;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser", "operatorsMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$Comparison", "operator", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/jaxrs/ext/search/ConditionType");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$Comparison", "isPrimitive", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/ext/search/SimpleSearchCondition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/SimpleSearchCondition", "<init>", "(Lorg/apache/cxf/jaxrs/ext/search/ConditionType;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/lang/String", "java/lang/Object", "org/apache/cxf/jaxrs/ext/search/ConditionType"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toLowerCase", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/ext/search/SimpleSearchCondition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singletonMap", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$Comparison", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singletonMap", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$Comparison", "tvalue", "Lorg/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$TypeInfoObject;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$TypeInfoObject", "getTypeInfo", "()Lorg/apache/cxf/jaxrs/ext/search/Beanspector$TypeInfo;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singletonMap", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/SimpleSearchCondition", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "isPrimitive", "(Ljava/lang/Object;)Z", "(TT;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("java.lang");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "createTemplate", "(Ljava/lang/String;)Ljava/lang/Object;", "(Ljava/lang/String;)TT;", new String[] { "org/apache/cxf/jaxrs/ext/search/SearchParseException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "java/lang/Throwable");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$Comparison", "this$0", "Lorg/apache/cxf/jaxrs/ext/search/fiql/FiqlParser;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser", "access$100", "(Lorg/apache/cxf/jaxrs/ext/search/fiql/FiqlParser;)Lorg/apache/cxf/jaxrs/ext/search/Beanspector;", false);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$Comparison", "this$0", "Lorg/apache/cxf/jaxrs/ext/search/fiql/FiqlParser;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser", "access$200", "(Lorg/apache/cxf/jaxrs/ext/search/fiql/FiqlParser;)Lorg/apache/cxf/jaxrs/ext/search/Beanspector;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/Beanspector", "instantiate", "()Lorg/apache/cxf/jaxrs/ext/search/Beanspector;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$Comparison", "tvalue", "Lorg/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$TypeInfoObject;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$TypeInfoObject", "getObject", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/Beanspector", "setValue", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/cxf/jaxrs/ext/search/Beanspector;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$Comparison", "this$0", "Lorg/apache/cxf/jaxrs/ext/search/fiql/FiqlParser;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser", "access$300", "(Lorg/apache/cxf/jaxrs/ext/search/fiql/FiqlParser;)Lorg/apache/cxf/jaxrs/ext/search/Beanspector;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/Beanspector", "getBean", "()Ljava/lang/Object;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$Comparison", "this$0", "Lorg/apache/cxf/jaxrs/ext/search/fiql/FiqlParser;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser", "access$400", "(Lorg/apache/cxf/jaxrs/ext/search/fiql/FiqlParser;)Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "newInstance", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/jaxrs/ext/search/SearchBean");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$Comparison", "tvalue", "Lorg/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$TypeInfoObject;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/fiql/FiqlParser$TypeInfoObject", "getObject", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/SearchBean", "set", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/ext/search/SearchParseException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/SearchParseException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
