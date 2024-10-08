package core.base;

import core.dsl.dslcadastrologin.DSLCadastroLogin;
import core.dsl.dslconta.DSLConta;
import core.dsl.dsllogin.DSLLogin;
import core.dsl.dslmovimentacao.DSLMovimentacao;
import core.dsl.dslresumomensal.DSLResumoMensal;

public class BasePage {
    protected final DSLLogin dslLogin;
    protected final DSLCadastroLogin dslCadastroLogin;
    protected final DSLConta dslConta;
    protected final DSLMovimentacao dslMovimentacao;
    protected final DSLResumoMensal dslResumoMensal;
    public BasePage() {
        dslLogin = new DSLLogin();
        dslCadastroLogin = new DSLCadastroLogin();
        dslConta = new DSLConta();
        dslMovimentacao = new DSLMovimentacao();
        dslResumoMensal = new DSLResumoMensal();
    }
}
