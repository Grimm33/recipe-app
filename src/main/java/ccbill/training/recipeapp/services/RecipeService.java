package ccbill.training.recipeapp.services;

import ccbill.training.recipeapp.commands.RecipeCommand;
import ccbill.training.recipeapp.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
