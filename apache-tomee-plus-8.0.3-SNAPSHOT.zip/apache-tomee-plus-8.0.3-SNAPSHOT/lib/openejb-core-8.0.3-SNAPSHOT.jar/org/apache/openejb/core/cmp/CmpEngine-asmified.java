package asm.org.apache.openejb.core.cmp;
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
public class CmpEngineDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openejb/core/cmp/CmpEngine", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createBean", "(Ljakarta/ejb/EntityBean;Lorg/apache/openejb/core/ThreadContext;)Ljava/lang/Object;", null, new String[] { "jakarta/ejb/CreateException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "loadBean", "(Lorg/apache/openejb/core/ThreadContext;Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "storeBeanIfNoTx", "(Lorg/apache/openejb/core/ThreadContext;Ljava/lang/Object;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeBean", "(Lorg/apache/openejb/core/ThreadContext;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "queryBeans", "(Lorg/apache/openejb/core/ThreadContext;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/util/List;", "(Lorg/apache/openejb/core/ThreadContext;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/util/List<Ljava/lang/Object;>;", new String[] { "jakarta/ejb/FinderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "queryBeans", "(Lorg/apache/openejb/BeanContext;Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/List;", "(Lorg/apache/openejb/BeanContext;Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/List<Ljava/lang/Object;>;", new String[] { "jakarta/ejb/FinderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "executeUpdateQuery", "(Lorg/apache/openejb/BeanContext;Ljava/lang/String;[Ljava/lang/Object;)I", null, new String[] { "jakarta/ejb/FinderException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deploy", "(Lorg/apache/openejb/BeanContext;)V", null, new String[] { "org/apache/openejb/OpenEJBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "undeploy", "(Lorg/apache/openejb/BeanContext;)V", null, new String[] { "org/apache/openejb/OpenEJBException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
